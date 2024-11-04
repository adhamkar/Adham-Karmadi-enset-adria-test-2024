package org.exemple.virementservice.repos;

import org.exemple.virementservice.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VirementRepo extends JpaRepository<Virement, Long> {
}
