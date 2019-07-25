package br.com.vellido.oauth2.controller;

import br.com.vellido.oauth2.domain.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @GetMapping
    public List<Category> list() {
        Category cat1 = new Category(1, "Informatica");

        List<Category> categories = new ArrayList<>();
        categories.add(cat1);

        return categories;
    }
}
