
package com.wildcodeschool.wizardsnpotions.controller;


import com.wildcodeschool.wizardsnpotions.entity.*;

import com.wildcodeschool.wizardsnpotions.repository.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class SchoolController {

    @Autowired
    private SchoolRepository repository;

    @GetMapping("/schools")
    public String getAll(Model model) {
model.addAttribute("schools", repository.findAll());

        return "schools";
    }

    @GetMapping("/school")
    public String getSchool(Model model,
                            @RequestParam(required = false) Long id) {

        School school = new School();
        if (id != null) {
            Optional<School> optionalSchool = repository.findById(id);
            if (optionalSchool.isPresent()) {
                school = optionalSchool.get();
            }
        }
        model.addAttribute("school", school);
        return "school";
    }

    @PostMapping("/school")
    public String postSchool(@ModelAttribute School school) {

               repository.save(school);

        return "redirect:/schools";
    }

    @GetMapping("/school/delete")
    public String deleteSchool(@RequestParam Long id) {

        repository.deleteById(id);

        return "redirect:/schools";
    }
}
