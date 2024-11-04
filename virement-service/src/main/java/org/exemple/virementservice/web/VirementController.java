package org.exemple.virementservice.web;


import org.exemple.virementservice.Model.Beneficaire;
import org.exemple.virementservice.entities.Virement;
import org.exemple.virementservice.feign.BeneficaireRestClient;
import org.exemple.virementservice.service.VirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/virement-service")
public class VirementController {

    @Autowired
    private VirementService virementService;
    @Autowired
    private BeneficaireRestClient beneficaireRestClient;
    @GetMapping("/virements")
    public List<Virement> getVirements(){
        return virementService.getVirements();
    }
    @GetMapping("/virement/{id}")
    public Virement getVirement(@PathVariable Long id){
        Virement virement = virementService.getVirement(id);
        Beneficaire beneficaire=beneficaireRestClient.getBeneficairesById(virement.getId());
        virement.setBeneficiaire(beneficaire);
        return virement;
    }

 /*   @PostMapping("/beneficaire")
    public BeneficaireDTO savedBeneficaire(@RequestBody BeneficaireDTO beneficaireDTO){
        return beneficaireService.createBeneficaire(beneficaireDTO);
    }*/

}
