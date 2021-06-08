package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        //make a hashmap with a key that is a string of the github username and
        //values that are the student objects
        HashMap<String, Student> students = new HashMap<>();

        //Create a new student
        Student s1 = new Student("Stew");
        //add 4 grades for this students
        s1.addGrade(99);
        s1.addGrade(78);
        s1.addGrade(86);
        s1.addGrade(56);

        //Create another new student
        Student s2 = new Student("Chip");
        //add 3 grades for this student
        s2.addGrade(21);
        s2.addGrade(56);
        s2.addGrade(65);

        //Create another new student
        Student s3 = new Student("Dick");
        //add 3 grades for this student
        s3.addGrade(100);
        s3.addGrade(50);
        s3.addGrade(0);

        //Create another new student
        Student s4 = new Student("Linda");
        //add 3 grades for this student
        s4.addGrade(67);
        s4.addGrade(85);
        s4.addGrade(96);

        //add all four students to the hashmap
        students.put("ghStew", s1);
        students.put("ghChip", s2);
        students.put("ghDick", s3);
        students.put("ghLinda", s4);

        //get a scanner to process input from the user
        Scanner scanner = new Scanner(System.in);
        //ask user if they will enter a username to search for
        System.out.printf("Here are the GitHub usernames of our students:%n%n");

        //loop through the hashmap printing out all user names
        for (Map.Entry<String, Student> set :
                students.entrySet()) {
            System.out.printf("|%s| ", set.getKey());
        }
        System.out.printf("%n%n");
        //ask user f=if they would like to search for a username
        System.out.println("What student would you like to see more information on?");

        //load our method that asks them which student to get info on
        AskToSeeStudent(students, scanner);


    }

    private static void AskToSeeStudent(HashMap<String, Student> students, Scanner scanner) {
        //grab the info the user entered and assign it to a variable named searchName
        String searchName = scanner.next();
        //check to see if that name is found by using the method named SearchForStudent
        boolean iFoundAStudent = SearchForStudent(searchName, students);
        //if we did not find a student with a matching name
        if (!iFoundAStudent) {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\"%n%nWould you like to see another student?%n", searchName);
            //see if the user wants to try another search
            String response = scanner.next();
            if (response.equals("y")) {
                //if they wanted to do another search then ask them for input and call this same method again
                System.out.println("What student would you like to see more information on");
                AskToSeeStudent(students, scanner);
            } else {
                //The user did not want to search anymore so let's say goodbye
                SayGoodbye();
            }
        } else {
            //The student search found a match so let's process it
            Student foundStudent = students.get(searchName);
            //Display the info on the screen
            System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %.2f%n%n", foundStudent.getName(), searchName, foundStudent.getGradeAverage());
            //ask the user if they would like to search for another student
            System.out.printf("Would you like to see another student?%n");
            //get the user's response
            String response = scanner.next();
            if (response.equals("y")) {
                //if the response is yes, then get the new name they would like to search
                //for and call this method again
                System.out.println("What student would you like to see more information on?");
                AskToSeeStudent(students, scanner);
            } else {
                //The user did not want to search anymore so let's say goodbye
                SayGoodbye();
            }
        }
    }

    private static void SayGoodbye() {
        //Print out the goodbye message
        System.out.printf("%nGoodbye, and have a wonderful day!");
    }

    private static boolean SearchForStudent(String searchName, HashMap<String, Student> students) {
        //create a variable to return that let's the calling method know if we found a matching student or not
        boolean foundStudent = false;

        //loop through the hashmap
        for (Map.Entry<String, Student> set :
                students.entrySet()) {
            //check to see if the student name matches what the user sent in
            if (searchName.equals(set.getKey())) {
                //if it does match then let's set our variable to say we found a match
                foundStudent = true;
                //since we found a match there is no reason to keep looping so let's break
                break;
            }
        }
        //return the variable stating if we found a matching student or not
        return foundStudent;
    }
}
