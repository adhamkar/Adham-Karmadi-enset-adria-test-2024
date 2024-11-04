package org.exemple.beneficiaireservice.repos;

import org.exemple.beneficiaireservice.entities.Beneficaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BeneficaireRepo extends JpaRepository<Beneficaire, Long> {
}
