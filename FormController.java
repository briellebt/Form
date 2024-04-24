package com.briellebait.identificationapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    private List<FormData> previousEntries = new ArrayList<>();

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("entry", new FormData());
        return "form";
    }

    @PostMapping("/submitForm")
    public String submitForm(FormData entry, Model model) {
        // Validate form data
        if (entry.getName().isEmpty() || entry.getTitle().isEmpty()) {
            model.addAttribute("error", "Name and Title are required fields.");
            return "form";
        }


        // Add entry to the list of previous entries
        previousEntries.add(entry);

        // Redirect to confirmation page
        model.addAttribute("entry", entry);
        model.addAttribute("previousEntries", previousEntries);
        return "confirmation";
    }

    @GetMapping("/entries")
    public String showEntries(Model model) {
        model.addAttribute("previousEntries", previousEntries);
        return "entries";
    }



}
