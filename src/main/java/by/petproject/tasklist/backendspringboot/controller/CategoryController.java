package by.petproject.tasklist.backendspringboot.controller;

import by.petproject.tasklist.backendspringboot.repo.CategoryRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {


    private CategoryRepository categoryRepository;


    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


}
