import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Johnny Event Planner CLI");

        try {
            System.out.println("Tell me, how many guests will be attending?");
            String stringUserInputNumberOfGuests = bufferedReader.readLine();
            int userInputNumberOfGuests = Integer.parseInt(stringUserInputNumberOfGuests);

            System.out.println("Well aren't we popular. Now to choose your food options." +
                    "Enter one of the following:" +
                    "none, for no extra charge" +
                    "small, for 50 dollars a head" +
                    "medium, for 45 dollars a head" +
                    "large, for 40 dollars a head" +
                    "xl, for 35 dollars a head"
            );
            String stringUserInputFoodOption = bufferedReader.readLine();

            System.out.println("Great! Now onto beverages. These are all flat fees" +
                    "Enter one of the following:" +
                    "none, for no extra charge" +
                    "nonalcoholic, for 300 dollars" +
                    "small bar, for 500 dollars" +
                    "medium bar, for 1000 dollars" +
                    "large bar, for 2000 dollars" +
                    "xl bar, for 4000 dollars"
            );
            String stringUserInputBeverageOption = bufferedReader.readLine();

            System.out.println("Perfect, how we just need one more piece of information before we can tally up your total price. What type of entertainment do you want present?" +
                    "Enter one of the following:" +
                    "none, for no extra charge" +
                    "self provided, for no extra charge" +
                    "DJ, for 300 dollars" +
                    "KJ, for 200 dollars" +
                    "live band, for 1200 dollars"
            );
        }

        catch(IOException e) {
            e.getStackTrace();
        }

    }
}
