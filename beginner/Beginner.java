package beginner;

import java.util.Scanner;

public class Beginner {

    public static void main(String[] args) {
        // ... (your previous code for variables and operators) ...

        System.out.println("\n--- If-Else Conditions ---");

        int temperature = 20; // Example temperature
        if (temperature > 30) {
            System.out.println("It's a hot day! ☀️");
        } else if (temperature > 20) { // Will check this if (temperature > 30) is false
            System.out.println("It's a nice warm day. 😊");
        } else if (temperature > 10) { // Will check this if previous are false
            System.out.println("It's a bit chilly. 🧣");
        } else { // Will execute if all above conditions are false
            System.out.println("It's cold! 🥶");
        }

        // Another example using your 'uniYear' variable
        int currentUniYear = 2; // Let's use the updated year
        if (currentUniYear == 1) {
            System.out.println("You're a freshman!");
        } else if (currentUniYear == 2) {
            System.out.println("You're a sophomore!");
        } else if (currentUniYear == 3) {
            System.out.println("You're a junior! Getting serious now! 🚀");
        } else if (currentUniYear == 4) {
            System.out.println("You're a senior! Almost there! 🎉");
        } else {
            System.out.println("Invalid university year.");
        }

        // Example with boolean and logical operators
        boolean hasGoodGrades = true;
        boolean attendedLectures = true;

        if (hasGoodGrades && attendedLectures) {
            System.out.println("Excellent student!");
        } else if (hasGoodGrades || attendedLectures) {
            System.out.println("Good effort, keep it up!");
        } else {
            System.out.println("Might need to review your study habits. 🤔");
        }
        
        System.out.println("\n--- Switch statements ---");
        
        int day = 3;
        String dayName;
        
        switch(day){
            case 1:
                dayName = "Monday";
                break;
                
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid";
                //Break is optional here.
        }
        
        System.out.println("Today is: " + dayName);
        
        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("You got above 70%");
                break;
                
            case 'B':
                System.out.println("You got above 60-70%");
                break;
            case 'C':
                System.out.println("You got 50-60");
                break;
            case 'D':
                System.out.println("You got 40-50");
                break;
            default:
                System.out.println("Invalid");
        }
        
        
        System.out.println("\n--- Simple for loop! ---");
        for (int i = 1; i<=5; i++){
            System.out.println("Count: " + i);
        }
        
        System.out.println("\n--- for backwards ---");
        for (int j = 10; j>=0; j-=2){
            System.out.println("Count: " + j);
        }
        
        System.out.println("\n--- for loops with arrays ---");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (int k = 0; k<fruits.length; k++){
        System.out.println("Fruits: " + fruits[k]);
        }
        
        System.out.println("\n--- While loop ---");
        int count = 1;
        while(count<=5){
        System.out.println("While count: " + count);
        count++;
        }
        
        System.out.println("\n--- While loop for sum ---");
        int sum = 0;
        int number = 1;
        while(sum<15){
            sum += number;
        System.out.println("Adding " + number + ", Current Sum: " + sum);
        number++;
        }
        
          System.out.println("\n--- Do-While Loop Example ---");
        
          int i = 0;
          do{
          System.out.println("Do-while count: " + i);
          i++;
          }while(i<5);
          
           System.out.println("\n--- Do-While Loop (Guaranteed First Run) ---");
        int j = 10;
        do {
            // This will execute once even though j is not less than 5
            System.out.println("Do-While guaranteed run: " + j);
            j++; // Still good practice to increment/change the condition variable
        } while (j < 5); // Condition is false, so it runs only once
        
        Scanner inputScanner  = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String userName = inputScanner.nextLine();
        System.out.println("Hello, "+ userName);
        
        // 3. Get integer input (age)
        System.out.print("Enter your age: ");
        int userAge = inputScanner.nextInt(); // Reads only the integer
        System.out.println("You are " + userAge + " years old.");
                
        inputScanner.nextLine(); // Consume the leftover newline character
        
        // 4. Get another String input (e.g., favorite color, after age)
        System.out.print("What is your favorite color? ");
        String favColor = inputScanner.nextLine();
        System.out.println(favColor + " is a lovely color!");

        // 5. Close the scanner (important for resource management)
        inputScanner.close();
    }
}