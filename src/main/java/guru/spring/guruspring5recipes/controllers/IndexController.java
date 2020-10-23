package guru.spring.guruspring5recipes.controllers;

import guru.spring.guruspring5recipes.domain.Category;
import guru.spring.guruspring5recipes.domain.UnitOfMeasure;
import guru.spring.guruspring5recipes.repositories.CategoryRepository;
import guru.spring.guruspring5recipes.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Italian");
        Optional<UnitOfMeasure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Category Id is: "+categoryOptional.get().getId());
        System.out.println("Unit of measure Id is: "+unitOfMeasureOptional.get().getId());

        return "index";
    }
}