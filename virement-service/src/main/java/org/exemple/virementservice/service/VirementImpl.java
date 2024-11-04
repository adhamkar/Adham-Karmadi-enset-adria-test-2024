package org.exemple.virementservice.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.exemple.virementservice.entities.Virement;
import org.exemple.virementservice.repos.VirementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class VirementImpl implements VirementService{
    @Autowired
    private VirementRepo virementRepo;
    @Override
    public List<Virement> getVirements() {
        return virementRepo.findAll();
    }

    @Override
    public Virement getVirement(Long id) {
        return virementRepo.findById(id).orElseThrow();
    }
}
