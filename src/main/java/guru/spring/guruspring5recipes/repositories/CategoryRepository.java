package guru.spring.guruspring5recipes.repositories;

import guru.spring.guruspring5recipes.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
