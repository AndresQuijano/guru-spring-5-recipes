package guru.spring.guruspring5recipes.services;

import guru.spring.guruspring5recipes.commands.RecipeCommand;
import guru.spring.guruspring5recipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
