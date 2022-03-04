
package com.tarea3.Controller;

import com.tarea3.dao.VideojuegoDao;
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
    
    @Autowired
    private VideojuegoService juegoService;
    
    @RequestMapping("/")
    public String page(Model model) {
        var juegos = juegoService.getVideojuegos();
        model.addAttribute("juegos", "juegos");
        return "index";
    }
    
}
