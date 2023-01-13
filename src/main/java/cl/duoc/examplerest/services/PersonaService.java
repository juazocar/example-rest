package cl.duoc.examplerest.services;

import cl.duoc.examplerest.model.dto.PersonaDTO;

public class PersonaService {
    

    public PersonaDTO getPersona(){
        PersonaDTO personaDto = new PersonaDTO();
        personaDto.setIdPersona(1);
        personaDto.setDni("1-2");
        personaDto.setNombre("Isidora");
        personaDto.setApellido("Azocar");
        personaDto.setTelefono("1234656");
        return personaDto;
    }
}
