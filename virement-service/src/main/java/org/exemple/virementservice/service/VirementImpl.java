package org.exemple.virementservice.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.exemple.virementservice.Model.Beneficaire;
import org.exemple.virementservice.entities.Virement;
import org.exemple.virementservice.feign.BeneficaireRestClient;
import org.exemple.virementservice.repos.VirementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class VirementImpl implements VirementService{
    @Autowired
    private VirementRepo virementRepo;
    @Autowired
    private BeneficaireRestClient beneficaireRestClient;
    @Override
    public List<Virement> getVirements() {
        return virementRepo.findAll();
    }

    @Override
    public Virement getVirement(Long id) {
        return virementRepo.findById(id).orElseThrow();
    }

    @Override
    public void deleteVirement(Long id) {
        virementRepo.deleteById(id);
    }

    @Override
    public Virement addVirement(Virement virement) {
        virement.setDate(new Date());
        Beneficaire beneficaire=beneficaireRestClient.getBeneficairesById(virement.getBeneficiaireId());
        virement.setBeneficiaire(beneficaire);
        return virementRepo.save(virement);
    }
}
