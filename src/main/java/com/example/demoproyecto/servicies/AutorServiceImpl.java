package com.example.demoproyecto.servicies;

import com.example.demoproyecto.entities.Autor;
import com.example.demoproyecto.repositories.AutorRepository;
import com.example.demoproyecto.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
