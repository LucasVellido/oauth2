package br.com.vellido.oauth2.controller;

import br.com.vellido.oauth2.domain.Category;
import br.com.vellido.oauth2.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> list(@PathVariable Long id) {
        Category category = service.find(id);
         return ResponseEntity.ok().body(category);
    }
}
