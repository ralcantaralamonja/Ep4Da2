package pe.isil.Saturno_1431.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.isil.Saturno_1431.model.Inscripcion;

@Controller
public class InscripcionController {

    @PostMapping
    public String procesarInscripcion(@ModelAttribute("inscripcion") Inscripcion inscripcion) {
        int totalEntradas = inscripcion.getNinos()  + inscripcion.getAdultos() + inscripcion.getAdultosMayor() + inscripcion.getDeportistasCalificados();

        // Aquí puedes hacer lo que necesites con la información de las entradas,
        // como calcular el precio total, aplicar descuentos, guardar en la base de datos, etc.

        // Redirige a donde necesites después de procesar la inscripción
        return "redirect:/ruta-donde-quieras-redirigir";
    }

}
