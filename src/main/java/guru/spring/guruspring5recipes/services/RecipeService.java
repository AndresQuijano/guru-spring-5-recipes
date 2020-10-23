package guru.spring.guruspring5recipes.services;

import guru.spring.guruspring5recipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
