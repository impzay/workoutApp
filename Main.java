import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("What is your Isianame?");
        String inp = scan.nextLine();

        System.out.println("Your name is: " + inp);
    }
}
