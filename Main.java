import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What type of workout will you be doing today?");
        System.out.println("HITT");
        System.out.println("Cross Fit");
        System.out.println("Body Building");
        System.out.println("Power Lifting");
        System.out.println("Power Building");
        System.out.println("Athletic Training");

        String userChoice = scan.nextLine().toLowerCase();
        Workout(userChoice);

       }

       public static void Workout(String w){



       }
}
