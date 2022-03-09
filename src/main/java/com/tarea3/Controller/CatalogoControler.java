
package com.tarea3.Controller;

import com.tarea3.dao.VideojuegoDao;
import com.tarea3.domain.Videojuegos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tarea3.service.VideojuegoService;

/**
 *
 * @author Sebastián Lizano
 */

@Controller
@Slf4j


public class CatalogoControler {
    /*
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Estamos en MVC");
        
        return "index";
    }
    */

    @Autowired
    private VideojuegoDao videojuegoDao;
    /*
    @RequestMapping("/")
    public String page(Model model) {
        
        return "/index";
    }
    */
    @GetMapping("/")public String inicio(Model model){
        log.info("MVC");
        var videojuegos = videojuegoDao.findAll();
        model.addAttribute("videojuegos", videojuegos);
        return "index";        
    }
    
    /*
    @GetMapping("/mostrarCatalogo")
    public String mostrar (Model model){
        var juegos = juegoService.getVideojuegos();
        model.addAttribute("juegos", juegos);
        return "/Listar";
    }
    
    @GetMapping("/nuevoJuego")
    public String nuevoJuego (Videojuegos videojuego){
        return "Agregar";
    }
    
    @PostMapping("/guardarJuego")
    public String guardarJuego (Videojuegos videojuego){
        juegoService.save(videojuego);
        return "redirect:/mostrarCatalogo";
    }
    
    @GetMapping("/modificarJuego/{idjuego}")
    public String modificarJuego(Videojuegos videojuego, Model model){
        videojuego = juegoService.getVideojuego(videojuego);
        model.addAttribute("juego", videojuego);
        return "Agregar";
    }
    */
}
