package net.serghini.tpenseignants.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import net.serghini.tpenseignants.dtos.RequestEnseignantsDto;
import net.serghini.tpenseignants.dtos.ResponseAllEnseignantsDto;
import net.serghini.tpenseignants.dtos.ResponseEnseignantDto;
import net.serghini.tpenseignants.entities.Enseignant;
import net.serghini.tpenseignants.mappers.EnseignantMapper;
import net.serghini.tpenseignants.repository.EnseignantsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class EnseignantServiceImpl implements EnseignantService {
    private EnseignantsRepository  enseignantsRepository;
    private EnseignantMapper enseignantMapper;
    @Override
    public ResponseEnseignantDto addEnseignant(RequestEnseignantsDto requestEnseignantsDto) {
        Enseignant enseignant = enseignantMapper.Dto_to_entity(requestEnseignantsDto);
        Enseignant saved = enseignantsRepository.save(enseignant);

        return enseignantMapper.entity_to_dto(saved);
    }

    @Override
    public ResponseEnseignantDto getEnseignantById(Long id)
    {  Enseignant enseignant =enseignantsRepository.findById(id).orElseThrow();
        ResponseEnseignantDto response = enseignantMapper.entity_to_dto(enseignant);



        return response;
    }

    @Override
    public List<ResponseAllEnseignantsDto> getALLEnseignants() {
        List<Enseignant> allEns = enseignantsRepository.findAll();
        List<ResponseAllEnseignantsDto> all_ens = new ArrayList<>();
        for (Enseignant e : allEns) {
            all_ens.add(enseignantMapper.to_dto(e));

        }


        return all_ens;
    }



    @Override
    public ResponseEnseignantDto updateEnseignant(Long id, RequestEnseignantsDto requestEnseignantsDto) {

        Enseignant new_enseignant = enseignantMapper.Dto_to_entity(requestEnseignantsDto);
        Enseignant enseignant1 = enseignantsRepository.findById(id).orElseThrow();
        if (new_enseignant.getNom()!=null) enseignant1.setNom(new_enseignant.getNom());
        if (new_enseignant.getPrenom()!=null)  enseignant1.setPrenom(new_enseignant.getPrenom());
        if (new_enseignant.getEmail()!=null)enseignant1.setEmail(new_enseignant.getEmail());
        if (new_enseignant.getCNE()!=null)enseignant1.setCNE(new_enseignant.getCNE());
        if (new_enseignant.getMot_de_passe()!=null)enseignant1.setMot_de_passe(new_enseignant.getMot_de_passe());
        if (new_enseignant.getThematique_de_recherche()!=null)enseignant1.setThematique_de_recherche(new_enseignant.getThematique_de_recherche());
        if (new_enseignant.getIdChercheur()!=null)enseignant1.setIdChercheur(enseignant1.getId());
        Enseignant saved = enseignantsRepository.save(enseignant1);



        return enseignantMapper.entity_to_dto(saved);

    }

    @Override
    public void deleteEnseignant(Long id) {
        enseignantsRepository.deleteById(id);

    }
}
