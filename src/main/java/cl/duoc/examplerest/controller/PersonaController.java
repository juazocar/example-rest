package cl.duoc.examplerest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.examplerest.model.dto.PersonaDTO;
import cl.duoc.examplerest.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    
    @GetMapping(path = "/persona", produces = { "application/json" })
    public PersonaDTO getPersona(){
        PersonaService personaService = new PersonaService();
        return personaService.getPersona();
    }

}
