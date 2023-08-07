import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe() {
        this("", 0, new ArrayList<String>());
    }

    public Recipe(String name, int cookingTime) {
        this(name, cookingTime, new ArrayList<String>());
    }

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String name() {
        return name;
    }

    public int cookingTime() {
        return cookingTime;
    }

    public ArrayList<String> ingredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }

}
