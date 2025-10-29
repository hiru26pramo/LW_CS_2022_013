package LW_05.Q_02;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering = new ArrayList<>();

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public void displayInfo(){
        System.out.println("Degree name : " + name);
        System.out.println("Number of students enrolled : " + numberOfStudents);
        System.out.println("Courses offering : ");
        for (Course course : coursesOffering){
            System.out.println("\t" + course);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    //Method to offer course
    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

    //Method to withdraw course
    public void withdrawCourse(Course withdraw){
        boolean isWithdrawCourseSuccessful = false;
        for (Course course : coursesOffering){
            if(course.equals(withdraw)){
                coursesOffering.remove(withdraw);
                isWithdrawCourseSuccessful =true;
            }
        }
        if (isWithdrawCourseSuccessful == false){
            System.out.println("You are not offer" + withdraw + " course" );
        }
    }

    //Method to ist courses offering
    public void listCoursesOffering(){
        System.out.println("Courses offering : ");
        for (Course course : coursesOffering){
            System.out.println(course.getName());
        }
    }

}
