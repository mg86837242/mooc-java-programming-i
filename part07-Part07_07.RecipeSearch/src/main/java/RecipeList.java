import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<Recipe>();
    }

    public void add(Recipe recipe) {
        recipeList.add(recipe);
    }

    public void printRecipes() {
        for (Recipe r : recipeList) {
            System.out.println(r);
        }
    }

    public void printByName(String searchedName) {
        for (Recipe r : recipeList) {
            if (r.name().contains(searchedName)) {
                System.out.println(r);
            }
        }
    }

    public void printByMaxCookingTime(int searchedTime) {
        for (Recipe r : recipeList) {
            if (r.cookingTime() <= searchedTime) {
                System.out.println(r);
            }
        }
    }

    public void printByIngredient(String searchedIngredient) {
        for (Recipe r : recipeList) {
            if (r.ingredients().contains(searchedIngredient)) {
                System.out.println(r);
            }
        }
    }

}
