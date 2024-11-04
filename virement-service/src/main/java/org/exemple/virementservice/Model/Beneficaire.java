package org.exemple.virementservice.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Beneficaire {
    private Long id;
    private String nom;
    private String prenom;
    private String rib;
    @Enumerated(EnumType.STRING)
    private BeneficaireEnum type;
}
