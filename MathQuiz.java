// Import the Scanner class
import java.util.Scanner;

public class MathQuiz{

    // Create four methods that represents the four operations (addition, subtraction, multiplication, division).

    // Addition
    public static int add(int a, int b){
        return a + b;
    }

    // Subtraction
    public static int sub(int a, int b){
        return a - b;
    }

    // Multiplication
    public static int mul(int a, int b){
        return a * b;
    }

    // Division
    public static int div(int a, int b){
        if (b == 0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args){

        // Initialize a variable that represents the user's score
        int score = 0;
        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);

        // Prompt the user to enter his/her name
        System.out.print("Enter Your Name: ");
        // Read user input
        String name = myObj.nextLine();

        // Check if the user entered a name
        if(name.isEmpty()){
            System.out.print("You did not enter a name");
        }
        else{
            System.out.println("Welcome to MathQuiz " + name + "!");
        }

        // Prompt the user to answer random math questions
        System.out.print("What is 5 + 5? ");
        int answer1 = myObj.nextInt();
        int correctAnswer1 = add(5, 5);

        if (answer1 != correctAnswer1){
            System.out.println("Incorrect! The correct answer is " + correctAnswer1);
        }
        else{
            score++;
            System.out.println("Correct!");
        }

        System.out.print("What is 10 - 5? ");
        int answer2 = myObj.nextInt();
        int correctAnswer2 = sub(10, 5);

        if (answer2 != correctAnswer2){
            System.out.println("Incorrect! The correct answer is " + correctAnswer2);
        }
        else{
            score++;
            System.out.println("Correct!");
        }

        System.out.print("What is 5 * 5? ");
        int answer3 = myObj.nextInt();
        int correctAnswer3 = mul(5, 5);

        if (answer3 != correctAnswer3){
            System.out.println("Incorrect! The correct answer is " + correctAnswer3);
        } else {
            score++;
            System.out.println("Correct!");
        }

        // Add a division question
        System.out.print("What is 10 / 2? ");
        int answer4 = myObj.nextInt();
        int correctAnswer4 = div(10, 2);

        if (answer4 != correctAnswer4){
            System.out.println("Incorrect! The correct answer is " + correctAnswer4);
        } else {
            score++;
            System.out.println("Correct!");
        }

        // Display the user's score.
        System.out.println("Your score is " + score + "/4");
    }
}