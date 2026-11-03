package org.iesvegademijas.tienda_informatica.controlador;

import io.github.wimdeblauwe.htmx.spring.boot.mvc.HxRequest;
import org.iesvegademijas.tienda_informatica.modelo.Fabricante;
import org.iesvegademijas.tienda_informatica.servicio.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.FragmentsRendering;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/htmx")
public class FabricanteHtmxController {

    @Autowired
    private FabricanteService fabricanteService;

    @GetMapping("/fabricantes")
    public String listar(Model model, @RequestParam Optional<Integer> numPag, @RequestParam Optional<Integer> tamPag) {

        int _numPag = 1;
        if (numPag.isPresent()) _numPag = numPag.get();

        int _tamPag = 10;
        if (tamPag.isPresent()) _tamPag = tamPag.get();

        Pagina<Fabricante> pagFab = fabricanteService.paginaFabricante(_numPag, _tamPag);
        model.addAttribute("pagina", pagFab);

        return "htmx/fabricantes";

    }


    @GetMapping("/fabricantes/pagina")
    public View listarPagina(Model model, @RequestParam Optional<Integer> numPag, @RequestParam Optional<Integer> tamPag) {

        int _numPag = 1;
        if (numPag.isPresent()) _numPag = numPag.get();

        int _tamPag = 10;
        if (tamPag.isPresent()) _tamPag = tamPag.get();

        Pagina<Fabricante> pagFab = fabricanteService.paginaFabricante(_numPag, _tamPag);
        model.addAttribute("pagina", pagFab);

        return FragmentsRendering
                .with("htmx/fragmento/fila-fabricante")
                .fragment("htmx/fragmento/paginador")
                .build();

    }

    @HxRequest
    @GetMapping("/fabricantes/editar/{id}")
    public String editar(Model model, @PathVariable Integer id, @RequestParam Optional<Integer> numPag, @RequestParam Optional<Integer> tamPag) {

        int _numPag = 1;
        if (numPag.isPresent()) _numPag = numPag.get();

        int _tamPag = 10;
        if (tamPag.isPresent()) _tamPag = tamPag.get();

        Pagina pagina = Pagina.builder()
                .numeroDePagina(_numPag)
                .tamanio(_tamPag)
                .build();

        Fabricante fabricante = fabricanteService.one(id);
        model.addAttribute("fabricante", fabricante);
        model.addAttribute("pagina", pagina );

        return "htmx/fragmento/editar-fabricante";

    }

    @HxRequest
    @PutMapping("/fabricantes/editar/{id}")
    public String submitEditar(Model model, @ModelAttribute("fabricante") Fabricante fabricante, @RequestParam Optional<Integer> numPag, @RequestParam Optional<Integer> tamPag) {

        int _numPag = 1;
        if (numPag.isPresent()) _numPag = numPag.get();

        int _tamPag = 10;
        if (tamPag.isPresent()) _tamPag = tamPag.get();

        fabricanteService.replaceFabricante(fabricante);
        model.addAttribute("pagina",Pagina.builder()
                                                            .numeroDePagina(_numPag)
                                                            .tamanio(_tamPag)
                                                            .listado(List.of(fabricante)).build());
        return "htmx/fragmento/fila-sola-fabricante";
    }

    @HxRequest
    @GetMapping("/fabricantes/fila/{id}")
    public String fila(Model model, @PathVariable Integer id) {

        Fabricante fabricante = fabricanteService.one(id);
        model.addAttribute("pagina", Pagina.<Fabricante>builder().listado(List.of(fabricante)).build());

        return "htmx/fragmento/fila-sola-fabricante";

    }

    @HxRequest
    @GetMapping("/fabricantes/borrar/{id}")
    public String getConfirmarBorrar(Model model, @PathVariable Integer id, @RequestParam Optional<Integer> numPag, @RequestParam Optional<Integer> tamPag) {

        int _numPag = 1;
        if (numPag.isPresent()) _numPag = numPag.get();

        int _tamPag = 10;
        if (tamPag.isPresent()) _tamPag = tamPag.get();

        Pagina pagina = Pagina.builder()
                .numeroDePagina(_numPag)
                .tamanio(_tamPag)
                .build();


        Fabricante fabricante = fabricanteService.one(id);
        model.addAttribute("fabricante", fabricante);
        model.addAttribute("pagina", pagina);

        return "htmx/fragmento/eliminar-fabricante";
    }

    @HxRequest
    @DeleteMapping("/fabricantes/borrar/{id}")
    public String submitBorrar(Model model, @PathVariable Integer id, @RequestParam Optional<Integer> numPag, @RequestParam Optional<Integer> tamPag) {

        int _numPag = 1;
        if (numPag.isPresent()) _numPag = numPag.get();

        int _tamPag = 10;
        if (tamPag.isPresent()) _tamPag = tamPag.get();

        Pagina pagina = Pagina.builder()
                                .numeroDePagina(_numPag)
                                .tamanio(_tamPag)
                                .build();

        model.addAttribute("pagina", pagina);
        fabricanteService.deleteFabricante(id);

       return "htmx/fragmento/vacio";

    }

    @HxRequest
    @GetMapping("/fabricantes/crear")
    public View getCrear(@ModelAttribute("fabricante") Fabricante fabricante) {

        return FragmentsRendering
                .with("htmx/fragmento/crear-btn-vacio-fabricante")
                .fragment("htmx/fragmento/crear-fabricante")
                .build();

    }

    @HxRequest
    @PostMapping("/fabricantes/crear")
    public String postCrear(@ModelAttribute Fabricante fabricante) {

        fabricanteService.newFabricante(fabricante);

        return "refresh:htmx";

    }

    @HxRequest
    @GetMapping("/refrescar")
    public String refrescar() {
        return "refresh:htmx";
    }

}
