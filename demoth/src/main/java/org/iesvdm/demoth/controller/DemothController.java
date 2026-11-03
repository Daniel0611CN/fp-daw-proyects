package org.iesvdm.demoth.controller;

import jakarta.servlet.http.HttpSession;
import org.iesvdm.demoth.domain.Libro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/demoth") //Es la ruta base http://localhost:8080/demoth
public class DemothController {

    // ruta enpoint /demoth/1
    @GetMapping("/1")
    public String demoth1(Model model) {
        model.addAttribute("texto", "Hola mundo, esto es más habitual!");
        model.addAttribute("texto2", "Esto es el segundo párrafo");
        return "demoth1";
    }

    @GetMapping({"/2", "/libros"})
    public String demoth2(Model model) {

        // La única forma de cambiar un objeto inmutable, es crear una nueva referencia de ese objeto, es decir:
        Libro elQuijote = new Libro("Don Quijote", "Cervantes", "Santillana");
        elQuijote = new Libro("Don Quijote", "Cervantes", "Anaya"); // <-- Hemos cambiado la editorial del libro elQuijote

        // OJO, el atributo del atribute, se debe llamar igual que el de index.html;
        model.addAttribute("libroList", List.of(new Libro("Don Quijote", "Cervantes", "Santillana"),
                                                new Libro("El corazón de las tinieblas", "Conrad", "Santillana")));
        return "demoth2";
    }

    @GetMapping("/3")
    public String demoth3(Model model, HttpSession session) {
        String variable = "Hola, mundo!";

        model.addAttribute("unaVariable", variable);

        String variableSesion = "Esto es una variable de sesión...";

        session.setAttribute("unaVariableDeSesion", variableSesion);

        Libro libro = new Libro("El Quijote", "Miguel Cervantes", "Anaya");
        session.setAttribute("ElQuijote", libro);

        return "demoth3";
    }

    @GetMapping("/4")
    public String demoth4(Model model) {
        Libro libro = new Libro("El Quijote", "Miguel Cervantes", "Anaya");

        model.addAttribute("libro", libro);
        return "demoth4";
    }

    @GetMapping("/5")
    public String demoth5(Model model) {

        Libro libro = new Libro(1, "El Quijote", "Miguel Cervantes", "Anaya");

        model.addAttribute("libro", libro);

        return "demoth5";
    }

    @GetMapping("/6")
    public String demoth6(Model model) {

        Libro libro = new Libro(1, "El Quijote", "Miguel Cervantes", "Anaya");

        model.addAttribute("libro", libro);

        return "demoth6";
    }

    @GetMapping("/7")
    public String demoth7(Model model) {

        return "demoth7";
    }

    @GetMapping("/8")
    public String demoth8(Model model) {

        return "demoth8";
    }

}
