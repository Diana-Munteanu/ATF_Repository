package md.tekwillacademy.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random random = new Random();

    // Method to generate a random integer within the specified limit
    public static int generateRandomInt(int limit) {
        return random.nextInt(limit);
    }

//     Method to generate a random integer within the specified range (min, max)
    public static int generateRandomInt(int min, int max) {
        int randomNumber;
        if (max > min) {
            // If max is greater than min, generate a random integer within the range [min, max)
            return random.nextInt(min, max);
        } else {
            // If max is not greater than min, return 0 (or handle the case as needed)
            return 0;
        }
    }

    public static String returnRandomString(String domain){
        String uuid = UUID.randomUUID().toString();
        return uuid + "@" + domain;
    }


    public static String returnRandomString(){
        String uuid = UUID.randomUUID().toString();
        return uuid + "@gmail.com";
    }
}
