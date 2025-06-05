package com.example.demoproyecto.servicies;

import com.example.demoproyecto.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> search(String filtro) throws Exception;

}
