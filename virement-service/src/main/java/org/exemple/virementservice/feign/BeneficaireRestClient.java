package org.exemple.virementservice.feign;

import org.exemple.virementservice.Model.Beneficaire;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "beneficiaire-service")
public interface BeneficaireRestClient {
    @GetMapping("/beneficaires")
    Beneficaire getBeneficaires();
    @GetMapping("/beneficaires/{id}")
    Beneficaire getBeneficairesById(@PathVariable("id") Long id);
}
