import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapterTest {

    private CategoriesAdapter categoriesAdapter;

    @Before
    public void setUp() {
        // Initialisation du CategoriesAdapter avec des catégories fictives pour les tests
        List<String> categoriesList = new ArrayList<>();
        categoriesList.add("Nature");
        categoriesList.add("Histoire");
        categoriesList.add("Gastronomie");
        categoriesAdapter = new CategoriesAdapter(categoriesList);
    }

    @Test
    public void testItemCount() {
        assertEquals(3, categoriesAdapter.getItemCount());
    }

    // Ajoutez d'autres tests ici pour tester le comportement du CategoriesAdapter
}
