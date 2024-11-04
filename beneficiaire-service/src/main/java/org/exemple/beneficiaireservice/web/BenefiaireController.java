package org.exemple.beneficiaireservice.web;

import org.exemple.beneficiaireservice.dtos.BeneficaireDTO;
import org.exemple.beneficiaireservice.entities.Beneficaire;
import org.exemple.beneficiaireservice.mapper.BeneficaireMapper;
import org.exemple.beneficiaireservice.repos.BeneficaireRepo;
import org.exemple.beneficiaireservice.service.BeneficaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficaire-service")
@CrossOrigin("*")
public class BenefiaireController {

    @Autowired
    private BeneficaireService beneficaireService;
    @Autowired
    private BeneficaireRepo beneficaireRepo;
    @Autowired private BeneficaireMapper beneficaireMapper;

    @GetMapping("/beneficaires")
    public List<Beneficaire> getBeneficaire(){
        return beneficaireService.getBeneficiaries();
    }
    @GetMapping("/beneficaire/{id}")
    public Beneficaire getBeneficaire(@PathVariable Long id){
        return beneficaireService.getBeneficiarie(id);
    }
/*    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO saveBankAccount(@RequestBody BankAccountRequestDTO bankAccount) {
        return accountService.createAccount(bankAccount);
    }*/
    @PostMapping("/beneficaire")
    public BeneficaireDTO savedBeneficaire(@RequestBody BeneficaireDTO beneficaireDTO){
        return beneficaireService.createBeneficaire(beneficaireDTO);
    }
    @PatchMapping("/beneficaire/{id}")
    public BeneficaireDTO updateBeneficaire(@RequestBody  BeneficaireDTO beneficaireDTO, @PathVariable Long id){
        Beneficaire existingBeneficaire = beneficaireService.getBeneficiarie(id);

        if (beneficaireDTO.getNom() != null) {
            existingBeneficaire.setNom(beneficaireDTO.getNom());
        }
        if (beneficaireDTO.getPrenom() != null) {
            existingBeneficaire.setPrenom(beneficaireDTO.getPrenom());
        }
        if (beneficaireDTO.getType() != null) {
            existingBeneficaire.setType(beneficaireDTO.getType());
        }
        if (beneficaireDTO.getRib() != null) {
            existingBeneficaire.setRib(beneficaireDTO.getRib());
        }

        // Save the updated entity
        Beneficaire savedBeneficaire = beneficaireRepo.save(existingBeneficaire);

        // Convert to DTO and return
        return beneficaireMapper.convertToDTO(savedBeneficaire);
    }
    @DeleteMapping("/beneficaire/{id}")
    public void deleteBeneficaire(@PathVariable Long id){
        beneficaireRepo.deleteById(id);
    }

}
