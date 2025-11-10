package net.serghini.tpenseignants.web;

import lombok.AllArgsConstructor;
import net.serghini.tpenseignants.dtos.RequestEnseignantsDto;
import net.serghini.tpenseignants.dtos.ResponseAllEnseignantsDto;
import net.serghini.tpenseignants.dtos.ResponseEnseignantDto;
import net.serghini.tpenseignants.services.EnseignantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/enseignants")
@AllArgsConstructor

public class EnseignantController {
    private EnseignantService enseignantService;

@GetMapping
    public ResponseEntity<List<ResponseAllEnseignantsDto>> getAllEnseignants() {
        return ResponseEntity.ok(enseignantService.getALLEnseignants());
    }
    @GetMapping("{id}")
   public ResponseEntity<ResponseEnseignantDto> getEnseignantById(@PathVariable Long id) {
        return ResponseEntity.ok(enseignantService.getEnseignantById(id));

   }
   @PostMapping
public ResponseEntity<ResponseEnseignantDto> creatEnse(@RequestBody RequestEnseignantsDto requestEnseignantsDto) {
   return     ResponseEntity.ok(enseignantService.addEnseignant(requestEnseignantsDto));

}
@PutMapping("{id}")
    public ResponseEntity<ResponseEnseignantDto> updateEnse(@PathVariable Long id, @RequestBody RequestEnseignantsDto requestEnseignantsDto) {
    return ResponseEntity.ok(enseignantService.updateEnseignant(id, requestEnseignantsDto));
}

    @DeleteMapping("{id}")
            public ResponseEntity DeletEnse(@PathVariable Long id){
        enseignantService.deleteEnseignant(id);
        return ResponseEntity.ok().build();
    }
}













