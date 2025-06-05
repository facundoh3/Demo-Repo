package com.example.demoproyecto.repositories;

import com.example.demoproyecto.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
