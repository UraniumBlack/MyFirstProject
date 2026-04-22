import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Ask the user for name and three scores
        System.out.print("Enter Student name: ");
        String studentName = input.nextLine();
        System.out.println("Enter 3 student scores: ");
        int[] grades = new int[3];
        for (int x=0; x<=2; x++)
            {   grades[x] = input.nextInt();    }

        System.out.println("Student: " + studentName);
        for (int x=0; x<=2; x++) {
            System.out.println("Score " + (x+1) + ": " + grades[x]);
        }
        // TODO: Calculate the average score
        double sum = 0;

        for (int x=0; x<=2; x++)
        {
            sum += grades[x];
        }

       // sum = (grades[0] + grades[1] + grades[2]);
        double avgScore = sum/(grades.length);
        System.out.println("Sum: " + sum);
        System.out.println("Average Score: " + avgScore);

        // TODO: Determine the letter grade based on the average
        int letterGrade = 0;
        if (avgScore >= 90)
        {System.out.println("Letter Grade: A"); letterGrade = 1;}
        else if (avgScore >=80 && avgScore <= 90)
        {System.out.println("Letter Grade: B"); letterGrade = 2;}
        else if (avgScore >=70 && avgScore <= 80)
        {System.out.println("Letter Grade: C"); letterGrade = 3;}
        else if (avgScore >=60 && avgScore <= 70)
        {System.out.println("Letter Grade: D"); letterGrade = 4;}
        else if (avgScore >=60)
        {System.out.println("Letter Grade: F"); letterGrade = 5;}

        // TODO: Display the results
        switch (letterGrade){
            case 1: System.out.println("Student \"" + studentName + "\" passed with an A"); break;
            case 2: System.out.println("Student \"" + studentName + "\" passed with a B"); break;
            case 3: System.out.println("Student \"" + studentName + "\" passed with a C"); break;
            case 4: System.out.println("Student \"" + studentName + "\" failed with a D"); break;
            case 5: System.out.println("Student \"" + studentName + "\" failed with a F"); break;
            default: System.out.println("Error: Improper Values assigned.");
        }


        input.close();
    }
}