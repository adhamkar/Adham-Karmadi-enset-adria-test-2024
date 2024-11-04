package org.exemple.virementservice;

import org.exemple.virementservice.Model.Beneficaire;
import org.exemple.virementservice.entities.Virement;
import org.exemple.virementservice.enums.Type;
import org.exemple.virementservice.feign.BeneficaireRestClient;
import org.exemple.virementservice.repos.VirementRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class VirementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirementServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(RepositoryRestConfiguration repoRestConfiguration, BeneficaireRestClient beneficaireRestClient, VirementRepo virementRepo) {
        repoRestConfiguration.exposeIdsFor(BeneficaireRestClient.class, Beneficaire.class, Virement.class);

        return args -> {
            Random rand = new Random();
            Beneficaire beneficaire =beneficaireRestClient.getBeneficairesById(1L);
            Virement virement = new Virement();
            virement.setId(null);
            virement.setBeneficiaire(beneficaire);
            virement.setBeneficiaireId(beneficaire.getId());
            virement.setType(Type.NORMAL);
            virement.setDate(new Date());
            virement.setRibSource("rib1");
            virement.setMontant(1+rand.nextDouble(900));
            virementRepo.save(virement);
        };
    }

}
