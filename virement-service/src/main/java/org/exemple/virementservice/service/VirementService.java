package org.exemple.virementservice.service;

import org.exemple.virementservice.entities.Virement;

import java.util.List;

public interface VirementService {
    List<Virement> getVirements();
    Virement getVirement(Long id);
    void deleteVirement(Long id);
    Virement addVirement(Virement virement);
    //BeneficaireDTO createBeneficaire(BeneficaireDTO beneficaireDTO);
}
