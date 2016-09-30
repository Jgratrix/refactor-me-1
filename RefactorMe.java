package refactorme;
import java.util.*;

public class RefactorMe {

    public static void main(String[] args) {
        getName();
        calculateSalary(2500, 400);
        calculateSides("square");
        countLetters();
    }

    public static void getName(){
        String name = "Jay";
        System.out.println(name);
    }

    public static void calculateSalary(int income, int tax) {
        // Salary = income - tax
        int salary = income - tax;
    }

    public static void calculateSides(String shape) {
        // this method should detect for
        // 1 square
        // 2 circle
        // 3 hexagon
        // 4 dodecagon

        if (shape.contains("square")) {
            System.out.println("Your shape has 4 sides");
        }
        else if (shape.contains("circle")) {
            System.out.println("Your shape has 1 side");
        }
        else if (shape.contains("hexagon")) {
            System.out.println("Your shape has 6 sides");
        }
        else if (shape.contains("dodecagon")) {
            System.out.println("Your shape has 12 sides");
        }
        else {
            System.out.println("Please enter a valid shape");
        }
    }

    public static void countLetters() {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        //String word = 
        System.out.println("You entered: " + word );

        System.out.println("You word is: " + word.length() + " letters long.");
    }

}
