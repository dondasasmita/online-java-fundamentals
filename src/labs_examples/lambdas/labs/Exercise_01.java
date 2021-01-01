package labs_examples.lambdas.labs;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */


class Exercise01Controller {

    public static void main(String[] args) {

        /**
         * ***********************
         *  Number 1 and 2
         *  **********************
         */

        Time myLocalTime = () -> {
            LocalDateTime localtime = LocalDateTime.now();
            System.out.println("Time in my area is : " + localtime);
        };

        myLocalTime.sayTime();

        /**
         * ***********************
         *  Number 3 and 4
         *  **********************
         */

        USTimezone usaTime = (String timezone) -> {
            String time = "";
            switch(timezone) {
                case "Pacific":
                    time = "GTM -8";
                    break;
                case "Mountain":
                    time = "GMT -7";
                    break;
                case "Central":
                    time = "GMT -6";
                    break;
                case "Eastern":
                default:
                    time = "GMT -5";
                    break;
            }
            return time;
        };

        String zone = "Eastern";
        String theTimezone = zone + " is " + usaTime.getGMT(zone);
        System.out.println(theTimezone);

        /**
         * ***********************
         *  Number 5 and 6
         *  **********************
         */

        DollarConverter usdToSgd = (double amount, String currency) -> {

            if (currency != "SGD") {
                System.out.println("No Data available yet!");
                return 0.0;
            }

            return amount * 1.32;

        };

        double money = usdToSgd.convert(100, "SGD");
        System.out.println(money);

        /**
         * ***********************
         *  Number 7
         *  **********************
         */



        String[] countries = {"USA", "Singapore", "Austria", "Australia", "Canada", "Japan"};

        // List all countries in the array
        System.out.println("The list of countries:");
        Arrays.asList(countries).forEach((country) -> System.out.println(country));

        // Select a random country from countries
        Supplier<String> randomCountry = () ->  {
            int num = (int)Math.floor(Math.random() * 5) + 1;
            return countries[num];
        };

        System.out.println("Randomly selected : " + randomCountry.get());

    }
}