import java.util.Scanner;

public class TestScoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To exit, enter 999.");
        System.out.println();

        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;

        while (testScore <= 100) {
            System.out.print("Enter score: ");
            String input = sc.nextLine();
            testScore = Integer.parseInt(input);

            if (testScore <= 100) {
                scoreCount++;
                scoreTotal += testScore;
            }
        }

        double averageScore = (double) scoreTotal / scoreCount;
        String message = "\nScore count: " + scoreCount + "\n" +
                         "Score total: " + scoreTotal + "\n" +
                         "Average score: " + averageScore + "\n";
        System.out.println(message);
        
        sc.close();
    }
} 
