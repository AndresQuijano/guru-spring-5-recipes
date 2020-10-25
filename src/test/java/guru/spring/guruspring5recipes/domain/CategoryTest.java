package guru.spring.guruspring5recipes.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {
    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();

    }

    @Test
    public void getId() {
        Long idTest=4L;

        category.setId(idTest);

        assertEquals(idTest, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}