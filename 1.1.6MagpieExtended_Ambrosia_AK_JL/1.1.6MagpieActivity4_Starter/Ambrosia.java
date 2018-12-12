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
import java.util.*; // import everything including List and ArrayList

public class Ambrosia
{
    /**
     * Get a default greeting   
     * @return a greeting
     */ 
    public String getGreeting()
    {
        return "Hello! It is I, Ambrosia! What are we cooking today?";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }
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
        else if (findKeyword(statement, "dumplings") >= 0)
        {
            response = "I love dumplings! What kind of dumplings would you like to eat?";
        }
        else if (findKeyword(statement, "tofu") >= 0)
        {
            response = "Do you want to try making mapo tofu? It's spicy, but delicious!";
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

   
        // Responses which require transformations
        else if (findKeyword(statement, "I want to eat", 0) >= 0)
        {
            response = transformIWantToEatStatement(statement);
        }
        else if (findKeyword(statement, "I want", 0) >= 0)
        {
            response = transformIWantStatement(statement);
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
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToEatStatement(String statement)
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
        String restOfStatement = statement.substring(psn + 9).trim();
        return "Alright! Do you want to try making " + restOfStatement + " today?";
        //return "Would you really be happy if you had to " + restOfStatement + "?";
    }
    
    private String transformIWantStatement(String statement)
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
    private String transformYouMeStatement(String statement)
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
    
    private String transformMeYouStatement(String statement)
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
    private int findKeyword(String statement, String goal, int startPos)
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
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }
    


    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
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
}
