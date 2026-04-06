import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
            
        System.out.println("Please enter your username: ");
        String name = scan.nextLine();

        System.out.println("Please enter your email: ");
        String email = scan.nextLine();

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        System.out.println("Please enter your weight in lbs: ");
        int weight = scan.nextInt();

        System.out.println("Please enter your height in inches: ");
        int height = scan.nextInt();
        User user = new User(name, email, 1, age, weight, height);
        Workout workout1 = new Workout(1, 500, 60, "Sprints", "2026, 10, 1");
        
        System.out.println("Total calories burned: " + workout1.getCalories());
       }
}
