package guru.spring.guruspring5recipes.repositories;

import guru.spring.guruspring5recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
