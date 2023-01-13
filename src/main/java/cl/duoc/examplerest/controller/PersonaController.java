package cl.duoc.examplerest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.examplerest.model.dto.PersonaDTO;
import cl.duoc.examplerest.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    PersonaService personaService;
    
    @GetMapping(path = "/persona", produces = { "application/json" })
    public List<PersonaDTO> getPersona(){
        return personaService.getAllPersonas();
    }

    @PostMapping(path = "/persona", consumes = {"application/json"},  produces = {"application/json"})
    public PersonaDTO add(@RequestBody PersonaDTO personaDTO){
        return personaService.add(personaDTO);
    }

}
