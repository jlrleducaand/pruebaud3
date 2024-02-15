package org.iesvdm.pruebaud3.dao;


import org.iesvdm.pruebaud3.dto.PeliculaDTO;
import org.iesvdm.pruebaud3.modelo.Pelicula;

import java.util.List;
import java.util.Optional;

public interface PeliculaDAO {

    // void create(Pelicula pelicula);

    List<Pelicula> getAll();

    //Optional<Pelicula> find(int id);

    //void update(Pelicula pelicula);

    //void delete(long id);

}
