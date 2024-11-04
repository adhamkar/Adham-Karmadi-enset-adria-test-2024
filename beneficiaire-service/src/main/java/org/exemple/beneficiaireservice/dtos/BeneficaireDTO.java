package org.exemple.beneficiaireservice.dtos;

import io.swagger.annotations.ApiModel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.exemple.beneficiaireservice.enums.Type;


@ApiModel(description = "All details about the Bank Account Request. ")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeneficaireDTO {
    private String nom;
    private String prenom;
    private String rib;
    @Enumerated(EnumType.STRING)
    private Type type;
}
