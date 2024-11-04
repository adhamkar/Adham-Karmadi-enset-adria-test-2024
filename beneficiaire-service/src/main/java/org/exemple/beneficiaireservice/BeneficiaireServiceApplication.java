package org.exemple.beneficiaireservice;

import org.exemple.beneficiaireservice.entities.Beneficaire;
import org.exemple.beneficiaireservice.enums.Type;
import org.exemple.beneficiaireservice.repos.BeneficaireRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class BeneficiaireServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeneficiaireServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(RepositoryRestConfiguration repoRestConfiguration, BeneficaireRepo beneficaireRepo) {
        repoRestConfiguration.exposeIdsFor(Beneficaire.class );
        return args -> {
            Random random = new Random();
            for(int i=0;i<10;i++){
                Beneficaire beneficaire =new Beneficaire();
                beneficaire.setNom("Nom"+i+1);
                beneficaire.setPrenom("Prenom"+i+1);
                beneficaire.setRib("Rib"+i+1);
                beneficaire.setType(random.nextBoolean() ? Type.PHYSIQUE : Type.MORALE);
                beneficaireRepo.save(beneficaire);
            }

        };
    }
}
