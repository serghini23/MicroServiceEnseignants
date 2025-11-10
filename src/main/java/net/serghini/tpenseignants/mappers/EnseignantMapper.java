package net.serghini.tpenseignants.mappers;

import net.serghini.tpenseignants.dtos.RequestEnseignantsDto;
import net.serghini.tpenseignants.dtos.ResponseEnseignantDto;
import net.serghini.tpenseignants.entities.Enseignant;
import org.springframework.beans.BeanUtils;

public class EnseignantMapper {
    public Enseignant Dto_to_entity(RequestEnseignantsDto requestEnseignantsDto) {
        Enseignant enseignant = new Enseignant();
        BeanUtils.copyProperties(requestEnseignantsDto, enseignant);
        return enseignant;
    }
    public ResponseEnseignantDto entity_to_dto (Enseignant enseignant) {
        ResponseEnseignantDto responseEnseignantDto = new ResponseEnseignantDto();
        BeanUtils.copyProperties(enseignant, responseEnseignantDto);
        return responseEnseignantDto;
    }
}
