package com.hotmail.bess410.tacocloud;

import com.hotmail.bess410.tacocloud.Ingridient.Type;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model, String name) {
        List<Ingridient> ingridients = Arrays.asList(
                new Ingridient("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingridient("COTO", "Corn Tortilla", Type.WRAP),
                new Ingridient("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingridient("CARN", "Carnitas", Type.PROTEIN),
                new Ingridient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingridient("LETC", "Lettuce", Type.VEGGIES),
                new Ingridient("CHED", "Cheddar", Type.CHEESE),
                new Ingridient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingridient("SLSA", "Salsa", Type.SAUCE),
                new Ingridient("SRCR", "Sour Cream", Type.SAUCE)
        );
        Type[] types = Type.values();
        Arrays.stream(types).forEach(type ->
                model.addAttribute(type.toString().toLowerCase(), filterByType(ingridients, type)
                ));

        model.addAttribute("design", new Taco(name));

        return "design";
    }

    private List<Ingridient> filterByType(List<Ingridient> ingridients, Type type) {
        return ingridients.stream()
                .filter(ingridient -> ingridient.getType() == type)
                .collect(Collectors.toList());
    }
}
