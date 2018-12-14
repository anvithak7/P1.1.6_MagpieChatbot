/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 *      Uses advanced search for keywords 
 *</li><li>
 *      Will transform statements as well as react to keywords
 *</li></ul>
 * @author Anvitha Kachinthaya and Janice Liu
 * @version December 2019
 *
 */

import java.util.Scanner;
import java.util.*; // Import everything including List and ArrayList.

public class Ambrosia
{
    /**
     * Get a default greeting   
     * @return a greeting
     */ 
    public String getGreeting() //Greets a user for the first time.
    {
        System.out.println("");
        return "Hello! It is I, Ambrosia! What are we cooking today? Or perhaps you'd like to teach me a recipe?";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given and the keywords inputted
     */
    public String getResponse(String statement) //Basic generic response code.
    {
        String response = "";
        statement = statement.toLowerCase();
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }
        // Responses which require transformations
        else if (findKeyword(statement, "I want to eat", 0) >= 0)
        {
            response = transformIWantToEatStatement(statement);
        }
        else if (findKeyword(statement, "I want to cook", 0) >= 0)
        {
            response = LocateRecipeForIWantToCookStatement(statement);
        }
        else if (findKeyword(statement, "I want", 0) >= 0)
        {
            response = transformIWantStatement(statement);
        }
        else if (findKeyword(statement, "recipes", 0) >= 0)
        {
            response = getRecipes();
        }
        //Normal input-responses
        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Okay. What else should I know?";
        }
        else if (findKeyword(statement, "yes") >= 0)
        {
            response = "Good! Let's do it.";
        }
        else if (findKeyword(statement, "thanks") >= 0)
        {
            response = "Of course!";
        }
        else if (findKeyword(statement, "spicy") >= 0)
        {
            response = "Oh, you want to eat spicy food? Do you want to make mapo tofu?";
        }
        else if (findKeyword(statement, "not spicy") >= 0)
        {
            response = "Hmmm... what non-spicy food should we cook today? What do you want to cook?";
        }
        else if (findKeyword(statement, "sweet") >= 0)
        {
            response = "I love sweet food! What kind of sweet food are you craving?";
        }

        else if (findKeyword(statement, "breakfast") >= 0)
        {
            response = "Breakfast is the most important meal of the day! What would you like to eat?";
        }
        else if (findKeyword(statement, "lunch") >= 0)
        {
            response = "I love having lunch! What would you like to eat?";
        }
        else if (findKeyword(statement, "dinner") >= 0)
        {
            response = "It's always nice to have a good meal to end the day. What would you like to eat?";
        }
        else if (findKeyword(statement, "dessert") >= 0)
        {
            response = "Yum! Dessert is always something I look forward to! What would you like to eat?";
        }
        else if (findKeyword(statement, "snack") >= 0)
        {
            response = "I'm sure we can all agree that we love snacks! What would you like to eat?";
        }
        else if (findKeyword(statement, "dim sum") >= 0)
        {
            response = "Yum! Eating dim sum is always something I look forward to! What would you like to eat?";
        }

        else if (findKeyword(statement, "vegetarian") >= 0)
        {
            response = "We offer many vegetarian recipes! What would you like to eat?";
        }
        else if (findKeyword(statement, "seafood") >= 0)
        {
            response = "We offer many seafood recipes! What would you like to eat?";
        }
        else if (findKeyword(statement, "wonton") >= 0)
        {
            response = "I love eating wontons! What kind do you like to eat?";
        }
        else if (findKeyword(statement, "fish") >= 0)
        {
            response = "Do you want to try making hot and sour fish? It's spicy and sour, but delicious!";
        }
        else if (findKeyword(statement, "soup") >= 0)
        {
            response = "Drinking warm soup is always the best! What kind of soup do you want to make?";
        }
        else if (findKeyword(statement, "lactose-intolerant") >= 0)
        {
            response = "We offer many recipes for people with lactose-intolerance. Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "paneer") >= 0)
        {
            response = "We offer many recipes for dishes containing paneer. Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "eggplant") >= 0)
        {
            response = "We offer many recipes for dishes containing eggplant. Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "peanuts") >= 0)
        {
            response = "We offer a variety of recipes for dishes with peanuts. Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "spinach") >= 0)
        {
            response = "Spinach is very healthy for you! Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "crunchy") >= 0)
        {
            response = "I love crunchy food! Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "sauce") >= 0)
        {
            response = "What kind of sauce you want to use? Soy sauce? BBQ sauce?";
        }
        else if (findKeyword(statement, "curry") >= 0)
        {
            response = "What kind of curry do you want to make?";
        }
        else if (findKeyword(statement, "carrots") >= 0)
        {
            response = "Carrots are very healthy for you! Do you have any dish in particular you want to make?";
        }
        else if (findKeyword(statement, "rice") >= 0)
        {
            response = "I love rice! Do you have any dish in particular you want to make?";
        }
        else if (findKeyword(statement, "noodles") >= 0)
        {
            response = "I love noodles! Do you have any dish in particular you want to make?";
        }
        else if (findKeyword(statement, "sour") >= 0)
        {
            response = "Sour food can taste very good! Do you have any dish in particular you want to make?";
        }
        else if (findKeyword(statement, "nut-free") >= 0)
        {
            response = "We consider your safety and preferences some of our top priorities in addition to giving you a recipe to a delicious meal. Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "eggless") >= 0)
        {
            response = "We consider your safety and preferences some of our top priorities in addition to giving you a recipe to a delicious meal. Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "wheatless") >= 0)
        {
            response = "We consider your safety and preferences some of our top priorities in addition to giving you a recipe to a delicious meal. Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "soy-free") >= 0)
        {
            response = "We consider your safety and preferences some of our top priorities in addition to giving you a recipe to a delicious meal. Do you have anything in particular you want to make?";
        }
        else if (findKeyword(statement, "Indian food") >= 0
        || findKeyword(statement, "Indian cuisine") >= 0)
        {
            response = "Do you have anything in mind that you want to eat?";
        }
        else if (findKeyword(statement, "Chinese food") >= 0
        || findKeyword(statement, "Chinese cuisine") >= 0)
        {
            response = "Do you have anything in mind that you want to eat?";
        }
        else if (findKeyword(statement, "hungry") >= 0
        || findKeyword(statement, "starving") >= 0)
        {
            response = "Are you hungry? What do you want to eat?";
        }

        else
        {
            // Look for a two word (you <something> me)
            // pattern
            int psn = findKeyword(statement, "you", 0);

            if (psn >= 0
            && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else if (psn >= 0 && findKeyword(statement, "I", 0) >= 0)
            {
                response = transformMeYouStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }

    /**
     * Take a statement with "I want to eat <something>." and transform it into 
     * "Alright, do you want to try making <something> today?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    public String transformIWantToEatStatement(String statement) //Changes statements into I want to eat something.
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }
        int psn = findKeyword (statement, "I want to eat", 0);
        String restOfStatement = statement.substring(psn + 13).trim();
        return "Alright! Do you want to try making " + restOfStatement + " today?";
        //return "Would you really be happy if you had to " + restOfStatement + "?";
    }

    /**
     * Gives a response to a user statement by asking if a user would truly be happy with that item.
     * 
     * @param statement
     *            the user statement, assumed to contain "I want"
     * @return the transformed statement
     */

    public String transformIWantStatement(String statement) //I want statements.
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }
        int psn = findKeyword (statement, "I want", 0);
        String restOfStatement = statement.substring(psn + 6).trim();
        //return "What would it mean to " + restOfStatement + "?";
        return "Would you really be happy if you had " + restOfStatement + "?";
    }

    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }

        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }

    /**
     * Take a statement with "I <something> you" and transform it into 
     * "Why do you <something> me?"
     * @param statement the user statement, assumed to contain "I" followed by "you"
     * @return the transformed statement
     **/
    public String transformMeYouStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }

        int psnOfI = findKeyword (statement, "I", 0);
        int psnOfYou = findKeyword (statement, "you", psnOfI + 1);

        String restOfStatement = statement.substring(psnOfI + 2, psnOfYou).trim();
        return "Why do you " + restOfStatement + " me?";
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        //  Refinement--make sure the goal isn't part of a word 
        while (psn >= 0) 
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " "; 
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }

            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
            && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }

            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }


    /**
     * Pick a default response to use if nothing else fits. Randomly generates a number between 0 and 10 which becomes the 
     * index of the word that is picked from an array list of random responses.
     * @return a non-committal string
     */
    public String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 11;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        List<String> randomresponselist = new ArrayList<String>();
        randomresponselist.add("Are you hungry? What’s it going to be today?");
        randomresponselist.add("I’m famished. What’s cooking?");
        randomresponselist.add("What’s that I hear? Is it mealtime?");
        randomresponselist.add("It’s time to eat! What are we making?");
        randomresponselist.add("Is it time for breakfast, lunch, or dinner? Or perhaps you want a snack?");
        randomresponselist.add("我饿了. Let’s eat!");
        randomresponselist.add("I didn't understand that. What are we making again?");
        randomresponselist.add("Do you have an ingredient in mind? I’m only familiar with a few, unfortunately.");
        randomresponselist.add("Okay. Are we still cooking a meal? What is it?");
        randomresponselist.add("Let’s eat! What do you have in mind?");
        randomresponselist.add("That's intriguing! I love the flavors of the world!");
        String response = randomresponselist.get(whichResponse);

        /**
        if (whichResponse == 0)
        {
        response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
        response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
        response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
        response = "You don't say.";
        }
         **/
        return response;

    }

    /**
     * Sets up the master recipe book as an array list of strings
     * iterates through each recipe name in the array and prints each out
     * @return list of recipes our chatbot knows as strings on a new line and non-committal string
     ***/
    public String getRecipes()
    {  
        List<String> recipeList = new ArrayList<String>();
        recipeList.add("pork dumplings");
        recipeList.add("naan");
        recipeList.add("dosa");
        recipeList.add("pulao");
        recipeList.add("vada");
        recipeList.add("payasa");
        recipeList.add("mapo tofu");
        recipeList.add("egg tart");

        //List response = recipeList.get(0);
        for(int i=0;i<recipeList.size();i++){
            System.out.println(recipeList.get(i));
        } 

        return "Which dish do you want to cook? I'll tell you the steps!";
    }

    /**
     * Sets up each recipe in the master cook book as its own array list.
     * Each step in the recipe is an item in that array list. 
     * All array lists of each individual recipe are added to the larger array list containing all recipe steps.
     * Iterates through each item in the larger arraylist for the given dish name.
     * @param the name of the specific dish 
     * @return the steps of the recipe the user input as an array
     ***/
    public String getRecipeSteps(String dishName)
    {  

        List<String> porkdumplings = new ArrayList<String>();
        porkdumplings.add("pork dumplings");
        porkdumplings.add("\nSteps:");
        porkdumplings.add("\nGet the ingredients: 1/2 cup soy sauce, 1 tablespoon seasoned rice vinegar, 1 tablespoon finely chopped Chinese chives, 1 tablespoon sesame seeds, 1 tsp chile-garlic sauce (such as Sriracha), 1 lb ground pork, 3 cloves garlic(minced), 1 egg(beaten), 2 tablespoons finely chopped Chinese chives, 2 tablespoons soy sauce, 1.5 tablespoons sesame oil, 1 tablespoon minced fresh ginger, 50 dumpling wrappers, 1 cup vegetable oil for frying, and 1 quart water or more.");
        porkdumplings.add("\nCombine 1/2 cup soy sauce, rice vinegar, 1 tablespoon chives, sesame seeds, and chile sauce in a small bowl. Set aside.");
        porkdumplings.add("\nMix pork, garlic, egg, 2 tablespoons chives, soy sauce, sesame oil, and ginger in a large bowl until thoroughly combined. ");
        porkdumplings.add("\nPlace a dumpling wrapper on a lightly floured work surface and spoon about 1 tablespoon of the filling in the middle.");
        porkdumplings.add("\nWet the edge with a little water and crimp together forming small pleats to seal the dumpling. Repeat with remaining dumpling wrappers and filling.");
        porkdumplings.add("\nHeat 1 to 2 tablespoons vegetable oil. in a large skillet over medium-high heat.");
        porkdumplings.add("\nPlace 8 to 10 dumplings in the pan and cook until browned, about 2 minutes per side.");
        porkdumplings.add("\nPour in 1 cup of water, cover and cook until the dumplings are tender and the pork is cooked through, about 5 minutes. Repeat for remaining dumplings.");

        List<String> naan = new ArrayList<String>();
        naan.add("naan");
        naan.add("\nSteps:");
        naan.add("\nGather all necessary ingredients: 1.75 cups all-purpose flour, 2 tsp sugar, 1 tsp salt, 3/4 tsp baking powder, 2 tsp oil (olive), 1/2 cup milk, butter, herbs for seasoning");
        naan.add("\nCombine all dry ingredients, and whisk together.");
        naan.add("\nCreate a well in the middle of the dry ingredients, and add the oil and milk.");
        naan.add("\nMix everything together until it forms a ball. Turn out on the counter and knead until very smooth and elastic — at least 5 minutes — adding more flour as necessary.");
        naan.add("\nLet the dough rest for 10 minutes. Divide into 8-10 equal pieces.");
        naan.add("\nHeat a skillet over medium-high heat.");
        naan.add("\nRoll one piece of dough until very thin (less than 1/8″). If the skillet isn’t non-stick, melt some butter before each piece. One at a time, cook the naan for about 90 seconds, or until parts are blackening, on each side. When they are done, you can brush them with butter and add seasonings (cilantro, garlic, etc.), if you want.");

        List<List> recipeStepsList = new ArrayList<List>();
        recipeStepsList.add(porkdumplings);
        recipeStepsList.add(naan);

        
        for(int i=0;i<recipeStepsList.size();i++){
            if (dishName.equals(recipeStepsList.get(i).get(0)))
            {
                for(int j=0;j<recipeStepsList.get(i).size();j++){
                System.out.println(recipeStepsList.get(i).get(j));
                
            }
            
        }
    }   
       
       System.out.println("\nHave fun cooking! Enjoy your meal!");
       return " ";
    }

    /**
     * Identifies the dish user wants to cook from "I want to cook" statement by the words following the phrase.
     * User-input dish is compared to the names of the dishes in the list of recipes to check if it is in it
     * If the dish is in the list of recipes, the getRecipeSteps method is called 
     * @param the user's statement
     * @return the steps of the dish's recipe or non-commital string informing the user that the recipe they want is not in the cookbook
     ***/
    public String LocateRecipeForIWantToCookStatement(String statement)
    {
        List<String> recipeList = new ArrayList<String>();

        recipeList.add("pork dumplings");
        recipeList.add("naan");
        recipeList.add("dosa");
        recipeList.add("pulao");
        recipeList.add("vada");
        recipeList.add("payasa");
        recipeList.add("mapo tofu");
        recipeList.add("egg tart");

        statement = statement.toLowerCase();
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }
        int psn = findKeyword (statement, "I want to cook", 0);
        String restOfStatement = statement.substring(psn + 14).trim();
        for(int i=0;i<recipeList.size();i++){
            
            if (restOfStatement.equals(recipeList.get(i)))
            {
                String dishName = restOfStatement;
                
                getRecipeSteps(dishName);
                //prints out for all inputs that are listed in recipe list
                System.out.println("\n(If no recipe shows up, the recipe is incomplete at this time.)");
                return"\nAre you still hungry? We encourage you to continue exploring our recipes!";
            }
           
        }
        //prints out this response for inputs not in recipe list
        return"\nSorry, the recipe for that dish is unavailable at this time!";

    }

    /**
     * Check if a user is sure of their recipe before adding it to the master recipe book.
     * @param the name of the recipe, the type of meal, and the list it should go into
     * @return whether it could fit or not, and adds the recipe to the book
     ***/
    public boolean userSure(String userSureInput, String f, List<String> m) {
        userSureInput = userSureInput.toLowerCase();
        if (userSureInput.contains("yes")) {
            m.add(f);
        }
        else {
            return false;
        }
        return true;
    }

    /**
     * Adds a recipe to its array list and double checks again, that the user is certain of their actions. 
     * @param the type of meal and the list it corresponds to
     * @return the master recipe book list
     **/
    public void addRecipeToList(String meal, List<String> list){ //Adds a recipe to the array list.
        System.out.println("What is the name of your delicious recipe for " + meal + " ? Type it exactly as you want it to appear in your recipe book!");
        Scanner in = new Scanner (System.in); //Creates an instance for the user's response.
        String b = in.nextLine();
        System.out.println("Are you sure you want to add " + b + " to the master recipe book?");
        String userSureInput = in.nextLine();
        userSure(userSureInput, b, list);
        System.out.println("Our current master " + meal + " recipe book contains: ");
        for (String m : list) {
            System.out.println(m);
        }
    }

}
