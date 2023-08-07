import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private RecipeList recipeList;
    private String fileName;

    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }

    public void start() {
        printInitialPrompt();
        readFile();
        readCommand();
    }

    public void printInitialPrompt() {
        System.out.print("File to read: ");
        fileName = scanner.nextLine();
        System.out.println("\nCommands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");
    }

    public void readFile() {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int cookingTime = Integer.parseInt(fileReader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        // This block will only be reached twice for `recipes.txt`, print here to
                        // observe (expected to print only twice cuz there're 2 empty lines between 3
                        // blocks of text)
                        break;
                    }
                    ingredients.add(ingredient);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipeList.add(recipe);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void readCommand() {
        loop: while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    break loop;
                case "list":
                    System.out.println("\nRecipes:");
                    recipeList.printRecipes();
                    System.out.println();
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String searchedName = scanner.nextLine();
                    System.out.println("\nRecipes:");
                    recipeList.printByName(searchedName);
                    System.out.println();
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int searchedTime = Integer.valueOf(scanner.nextLine());
                    System.out.println("\nRecipes:");
                    recipeList.printByMaxCookingTime(searchedTime);
                    System.out.println();
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String searchedIngredient = scanner.nextLine();
                    System.out.println("\nRecipes:");
                    recipeList.printByIngredient(searchedIngredient);
                    System.out.println();
                    break;
                default:
                    System.out.println("Unknown command: " + command);

            }
        }
    }

}