package damsko.springframework.RecipeProject.services;

import damsko.springframework.RecipeProject.commands.RecipeCommand;
import damsko.springframework.RecipeProject.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
