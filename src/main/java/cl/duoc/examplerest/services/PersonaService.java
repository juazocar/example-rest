package cl.duoc.examplerest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.examplerest.model.dto.PersonaDTO;
import cl.duoc.examplerest.model.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;
    
    public List<PersonaDTO> getAllPersonas(){
        return personaRepository.findAll();
    }

    public PersonaDTO add(PersonaDTO personaDTO){
        return personaRepository.save(personaDTO);
    }
}
