package net.serghini.tpenseignants.services;

import net.serghini.tpenseignants.dtos.RequestEnseignantsDto;
import net.serghini.tpenseignants.dtos.ResponseAllEnseignantsDto;
import net.serghini.tpenseignants.dtos.ResponseEnseignantDto;

import java.util.List;

public interface EnseignantService {
    public ResponseEnseignantDto addEnseignant(RequestEnseignantsDto  requestEnseignantsDto);
    public ResponseEnseignantDto getEnseignantById(Long id);
    public List <ResponseAllEnseignantsDto> getALLEnseignants();
    public ResponseEnseignantDto updateEnseignant(Long id, RequestEnseignantsDto  requestEnseignantsDto);
    public void deleteEnseignant(Long id);

}
