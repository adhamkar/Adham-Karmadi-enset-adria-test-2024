package org.exemple.virementservice.service;

import org.exemple.virementservice.entities.Virement;

import java.util.List;

public interface VirementService {
    List<Virement> getVirements();
    Virement getVirement(Long id);
    //BeneficaireDTO createBeneficaire(BeneficaireDTO beneficaireDTO);
}
