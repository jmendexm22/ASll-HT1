package gt.edu.umg.antiguaburger.controller;

import gt.edu.umg.antiguaburger.Greeting;
import gt.edu.umg.antiguaburger.OrdenDetalle;
import gt.edu.umg.antiguaburger.OrdenEncabezado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 */
@Controller
public class OrdenController {

    /**
     * Default constructor
     */
    public OrdenController() {
    }

    /**
     * @param ordenEncabezado
     * @return
     */
    @GetMapping("/nuevaOrden")
    public String nuevaOrden(Model model) {
        model.addAttribute("ordenDetalle", new OrdenDetalle());
        return "nuevaOrden";
    }

    @PostMapping("/crearOrden")
    public String crearOrden(@ModelAttribute OrdenDetalle ordenDetalle, Model model) {
        model.addAttribute("ordenDetalle", ordenDetalle);
        return "result";
    }

}
