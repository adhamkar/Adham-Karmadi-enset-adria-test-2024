package org.exemple.beneficiaireservice.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.exemple.beneficiaireservice.dtos.BeneficaireDTO;
import org.exemple.beneficiaireservice.entities.Beneficaire;
import org.exemple.beneficiaireservice.mapper.BeneficaireMapper;
import org.exemple.beneficiaireservice.repos.BeneficaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class BeneficaireImpl implements BeneficaireService {
    @Autowired
    private BeneficaireRepo beneficaireRepo;
    @Autowired
    private BeneficaireMapper beneficaireMapper;
    @Override
    public List<Beneficaire> getBeneficiaries() {
        return beneficaireRepo.findAll();
    }

    @Override
    public Beneficaire getBeneficiarie(Long id) {
        return beneficaireRepo.findById(id).orElseThrow();
    }

    @Override
    public BeneficaireDTO createBeneficaire(BeneficaireDTO beneficaireDTO) {
        Beneficaire beneficaire = new Beneficaire();
        beneficaire.setNom(beneficaireDTO.getNom());
        beneficaire.setPrenom(beneficaireDTO.getPrenom());
        beneficaire.setType(beneficaireDTO.getType());
        beneficaire.setRib(beneficaireDTO.getRib());
        Beneficaire saved=beneficaireRepo.save(beneficaire);
        return beneficaireMapper.convertToDTO(saved);
    }

    @Override
    public BeneficaireDTO updateBeneficaire(BeneficaireDTO beneficaireDTO) {
        Beneficaire beneficaire = beneficaireRepo.findById(beneficaireDTO.getId()).orElseThrow();

        beneficaire.setNom(beneficaireDTO.getNom());
        beneficaire.setPrenom(beneficaireDTO.getPrenom());
        beneficaire.setType(beneficaireDTO.getType());
        beneficaire.setRib(beneficaireDTO.getRib());
        Beneficaire saved=beneficaireRepo.save(beneficaire);
        return beneficaireMapper.convertToDTO(saved);
    }


    @Override
    public void deleteBeneficiarie(Long id) {
        beneficaireRepo.deleteById(id);
    }
}
