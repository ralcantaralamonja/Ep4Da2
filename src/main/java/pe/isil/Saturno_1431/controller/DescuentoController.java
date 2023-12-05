package pe.isil.Saturno_1431.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DescuentoController {
    @PostMapping("/calcularDescuento")
    public String calcularDescuento( @RequestParam(required = false) boolean chkNinos,
                                     @RequestParam int contadorNinos,
                                     @RequestParam(required = false) boolean chkAdultos,
                                     @RequestParam int contadorAdultos,
                                     @RequestParam(required = false) boolean chkAdultosMayor,
                                     @RequestParam int contadorAdultosMayor,
                                     @RequestParam(required = false) boolean chkDeportistaCalificado,
                                     @RequestParam int contadorDeportistaCalificado, Model model) {
        // Lógica de negocios para calcular descuento

        double descuentoTotal = 0.0;
        if (chkNinos) {
            descuentoTotal += calcularDescuentoNinos(contadorNinos);
        }

        if (chkAdultos) {
            descuentoTotal += calcularDescuentoAdultos(contadorAdultos);
        }

        if (chkAdultosMayor) {
            descuentoTotal += calcularDescuentoAdultosMayor(contadorAdultosMayor);
        }

        if (chkDeportistaCalificado) {
            descuentoTotal += calcularDescuentoDeportistaCalificado(contadorDeportistaCalificado);
        }

        // Puedes pasar el resultado al modelo para mostrarlo en la vista
        model.addAttribute("descuentoTotal", descuentoTotal);

        return "usuario/mis-cursos";

    }
    private double calcularDescuentoNinos(int cantidad) {
        // Implementa la lógica específica para el descuento de niños aquí
        // Puedes usar las reglas que mencionaste (descuento del 20% a partir de 2 personas)
        if (cantidad >= 2) {
            return 0.20; // 20% de descuento
        } else {
            return 0.0; // Sin descuento
        }
    }

    private double calcularDescuentoAdultos(int cantidad) {
        // Implementa la lógica específica para el descuento de adultos aquí
        // Puedes usar las reglas que mencionaste (descuento del 10% a partir de 3 personas)
        if (cantidad >= 3) {
            return 0.10; // 10% de descuento
        } else {
            return 0.0; // Sin descuento
        }
    }

    private double calcularDescuentoAdultosMayor(int cantidad) {
        // Implementa la lógica específica para el descuento de adultos mayores aquí
        // Puedes usar las reglas que mencionaste (descuento del 40% a partir de 1 persona)
        if (cantidad >= 1) {
            return 0.40; // 40% de descuento
        } else {
            return 0.0; // Sin descuento
        }
    }

    private double calcularDescuentoDeportistaCalificado(int cantidad) {
        // Implementa la lógica específica para el descuento de deportistas calificados aquí
        // Puedes usar las reglas que mencionaste (descuento del 100% a partir de 1 persona)
        if (cantidad >= 1) {
            return 1.0; // 100% de descuento
        } else {
            return 0.0; // Sin descuento
        }
    }
}