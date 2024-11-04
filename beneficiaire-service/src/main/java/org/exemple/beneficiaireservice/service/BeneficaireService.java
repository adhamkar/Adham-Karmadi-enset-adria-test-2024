package org.exemple.beneficiaireservice.service;

import org.exemple.beneficiaireservice.dtos.BeneficaireDTO;
import org.exemple.beneficiaireservice.entities.Beneficaire;

import java.util.List;

public interface BeneficaireService {
    List<Beneficaire> getBeneficiaries();
    Beneficaire getBeneficiarie(Long id);
    BeneficaireDTO createBeneficaire(BeneficaireDTO beneficaireDTO);

}
