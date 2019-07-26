package br.com.vellido.oauth2.services;

import br.com.vellido.oauth2.domain.Category;
import br.com.vellido.oauth2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category find(Long id) {
        return repository.findById(id).orElse(null);
    }
}
