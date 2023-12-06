package pe.isil.Saturno_1431.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.isil.Saturno_1431.model.Inscripcion;

import java.util.logging.Logger;

@Controller
public class InscripcionController {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(InscripcionController.class);

    @PostMapping("/calcularDescuento")
    public String procesarEntradas(@RequestParam("ninos") int cantidadNinos,
                                   @RequestParam("adultos") int cantidadAdultos,
                                   @RequestParam("adultosMayor") int cantidadAdultosMayor,
                                   @RequestParam("deportistasCalificados") int cantidadDeportistasCalificados) {
        // Realizar las operaciones necesarias con la cantidad de entradas recibidas

        int totalEntradas = cantidadNinos + cantidadAdultos + cantidadAdultosMayor + cantidadDeportistasCalificados;

        System.out.println("Cantidad de entradas:");
        System.out.println("Total: " + totalEntradas);
        System.out.println("Niños: " + cantidadNinos);
        System.out.println("Adultos: " + cantidadAdultos);
        System.out.println("Adultos Mayor: " + cantidadAdultosMayor);
        System.out.println("Deportistas Calificados: " + cantidadDeportistasCalificados);
        // Realizar otras operaciones con los datos recibidos

        // Redirigir a donde desees después de procesar las entradas
        return "index";
    }
}
