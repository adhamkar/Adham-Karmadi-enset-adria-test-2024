package org.exemple.virementservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.exemple.virementservice.Model.Beneficaire;
import org.exemple.virementservice.enums.Type;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long beneficiaireId;
    private String ribSource;
    private double montant;
    private String description;
    private Date date;
    private Type type;
    @Transient
    private Beneficaire beneficiaire;
}
