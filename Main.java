/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner userIn = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = userIn.next();
        
        if((name.equalsIgnoreCase("Alice")) || (name.equalsIgnoreCase("Bob"))) {
            System.out.println("Greetings " + name + ". Nice to meet you.");
        }
        else {
            System.out.println("I'm sorry. I don't recognize that user. TERMINATE!");
        }

    }
}
