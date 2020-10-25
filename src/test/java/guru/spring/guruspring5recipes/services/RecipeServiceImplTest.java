package guru.spring.guruspring5recipes.services;

import guru.spring.guruspring5recipes.domain.Recipe;
import guru.spring.guruspring5recipes.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {
        Recipe recipe = new Recipe();
        Set<Recipe> recipesTest=new HashSet<>();
        recipesTest.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesTest);

        Set<Recipe> recipesReturn = recipeService.getRecipes();

        assertEquals(recipesReturn.size(),1);
        verify(recipeRepository, times(1)).findAll();
    }
}