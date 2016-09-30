package refactorme;
import java.util.*;

public class RefactorMe {

    public static void main(String[] args) {
        getName();
        calculateSalary(2500, 400);
        calculateSides("circle");
        countLetters();
    }
    
    public static void getName(){
        System.out.println("Enter Your name");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println("Your name is: "+word);
    }
    
    public static void calculateSalary(int income, int tax) {
        int salary = income - tax;
         System.out.println("Your Salary is: "+salary);
    }
    
    public static void calculateSides(String shape) {
        if (shape.contains("square")) {
            System.out.println("Your shape has 4 sides");
        }else  if (shape.contains("circle")) {
            System.out.println("Your shape has 1 sides");
        }
        else  if (shape.contains("hexagon")) {
            System.out.println("Your shape has 6 sides");
        }
        else  if (shape.contains("dodecagon")) {
            System.out.println("Your shape has 12 sides");
        }
    }
    
    public static void countLetters() {
        System.out.println("Enter a word:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        //String word = 
        System.out.println("You entered: " + word);
        System.out.println("You word is: " + word.length() + " letters long.");
    }
    
}
