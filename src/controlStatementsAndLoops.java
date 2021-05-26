import java.util.Scanner;

public class controlStatementsAndLoops {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(" " + i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i += 5;
//        } while (i >= -10);

//        long i = 2L;
//        do {
//            System.out.println(i);
//            i += i;
//        } while  (i < 1000000);

//        for (int i = 100; i > -10; i -=5) {
//            System.out.println(i);
//        };

//        for (long i = 2L; i < 1000000; i += i) {
//              System.out.println(i);
//          };

//        Scanner scanner1 = new Scanner(System.in);
//        final int PIN = 12345;
//        int userInput = 0;
//        int attempts = 1;
//        while (attempts <= 3) {
//            System.out.println("Please enter pin: ");
//            userInput = scanner1.nextInt();
//            if (userInput != PIN){
//                if (attempts < 3) {
//                    System.out.println("Incorrect, try again");
//                } else {
//                    System.out.println("Sorry but you have been locked out");
//                }
//            } else {
//                System.out.println("Correct, welcome back");
//                break;
//            }
//            attempts++;
//        }

//        String userResponse = "";
//        do {
//            System.out.println("Please enter a number.");
//            int userInputNum = scanner.nextInt();
//            String table = "The number you have entered is: " + userInputNum + "\n\n" +
//                    "Here is your table!\n\n" +
//                    "number | squared | cubed\n" +
//                    "------ | ------- | -----\n";
//
//            for (int i = 1; i <= userInputNum; ++i) {
//                table += i + "      | " + i * i + "       | " + i * i * i + "\n";
//            }
//            System.out.println(table);
//            System.out.println("Would you like to continue?\nEnter yes to continue or no to stop.");
//            userResponse = scanner.next();
//        } while (userResponse.equals("yes"));

        Scanner scanner1 = new Scanner(System.in);
        String userChoice = "y";
        while (!userChoice.equals("n")) {
            System.out.println("Enter the student's numerical grade: ");
            short grade = scanner1.nextByte();
            char letterGrade;
            if (grade > 0 && grade <= 59) {
                letterGrade = 'F';
            } else if (grade > 59 && grade <= 66) {
                letterGrade = 'D';
            } else if (grade > 66 && grade <= 79) {
                letterGrade = 'C';
            } else if (grade > 79 && grade <= 87) {
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is: " + letterGrade);
            System.out.println("Would you like to enter another grade?(y/n)");

            userChoice = scanner1.next();
        }
    }
}
