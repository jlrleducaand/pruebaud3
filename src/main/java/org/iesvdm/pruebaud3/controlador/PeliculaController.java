package org.iesvdm.pruebaud3.controlador;

import org.iesvdm.pruebaud3.dao.PeliculaDAO;
import org.iesvdm.pruebaud3.dto.PeliculaDTO;
import org.iesvdm.pruebaud3.modelo.Pelicula;
import org.iesvdm.pruebaud3.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/peliculas") //Al no tener ruta base para el controlador, cada método tiene que tener la ruta completa
    public String listarPeliculas(Model model) {

        List<Pelicula> listPeliculas = peliculaService.listAll();
        model.addAttribute("listPeliculas", listPeliculas);

        return "peliculas";

    }

}
