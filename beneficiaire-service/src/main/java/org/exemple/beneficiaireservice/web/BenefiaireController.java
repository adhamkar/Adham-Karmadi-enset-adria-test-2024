package org.exemple.beneficiaireservice.web;

import org.exemple.beneficiaireservice.dtos.BeneficaireDTO;
import org.exemple.beneficiaireservice.entities.Beneficaire;
import org.exemple.beneficiaireservice.repos.BeneficaireRepo;
import org.exemple.beneficiaireservice.service.BeneficaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficaire-service")
public class BenefiaireController {

    @Autowired
    private BeneficaireService beneficaireService;
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

}
