package net.serghini.tpenseignants.repository;

import net.serghini.tpenseignants.entities.Enseignant;
import org.springframework.data.repository.CrudRepository;

public interface EnseignantsRepository extends CrudRepository<Enseignant, Long> {
}
