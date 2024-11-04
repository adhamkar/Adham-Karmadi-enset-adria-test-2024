package org.exemple.beneficiaireservice.mapper;
import org.exemple.beneficiaireservice.dtos.BeneficaireDTO;
import org.exemple.beneficiaireservice.entities.Beneficaire;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeneficaireMapper {
    @Autowired
    private ModelMapper modelMapper;

    public BeneficaireDTO convertToDTO(Beneficaire beneficaire){
        return modelMapper.map(beneficaire, BeneficaireDTO.class);
    }
    public Beneficaire convertToEntity(BeneficaireDTO beneficaireDTO){
        return modelMapper.map(beneficaireDTO, Beneficaire.class);
    }
}
