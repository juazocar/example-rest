package cl.duoc.examplerest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.examplerest.model.dto.PersonaDTO;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaDTO, Integer> {
    
}
