package net.serghini.tpenseignants.repository;

import net.serghini.tpenseignants.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EnseignantsRepository extends JpaRepository<Enseignant, Long> {
}
