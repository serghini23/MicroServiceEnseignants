package net.serghini.tpenseignants.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEnseignantDto {
    private Long  id;
    private String nom;
    private String prenom ;
    private String CNE;
    private String email;
    private String mot_de_passe ;
    private String thematique_de_recherche;
}
