package grades;


import java.util.ArrayList;

public class Student {
    //create a private property to hold the student name
    private String name;
    //create an array list to hold the students grades
    private ArrayList<Integer> grades;

    //create a constructor for a student that sets the name to the
    //value sent in and the grades arraylist to a blank integer arraylist
    public Student(String name) {
        //set name to what was sent in
        this.name = name;
        //set grades to new arraylist
        this.grades = new ArrayList<>();
    }

    //return the name of the student we are currently operating on
    public String getName() {
        return name;
    }

    // Set the name for the student but this is not necessary since I set it in the constructor
    public void setName(String c) {
        this.name = c;
    }

    //add a grade to the list of grades for the student
    public void addGrade(int grade)
    {
        this.grades.add(grade);
    }
//get the average of all of the grades the student currently has
    public double getGradeAverage()
    {
        //Set a variable to hold the number of elements in the grades arraylist
        int numberOfElements = grades.size();
        //create a variable to hold the runningtotal we will need to divide
        // by the number of elements
        double runningTotal = 0;

        //loop through every element
        for(int i=0; i<numberOfElements; i++)
        {
            //keep a running total of all of the grades
            runningTotal+= this.grades.get(i);
        }
        //divide the running total by the number of elements in order to get the average and return it
        return runningTotal/numberOfElements;
    }

}

