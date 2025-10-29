package LW_05.Q_02;

import java.util.ArrayList;

public class Student extends Person{
    private String studentId;
    public Degree degree;
    ArrayList<Course> coursesEnrolled;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String studentId, Degree degree) {
        super(name);
        this.studentId = studentId;
        this.degree = degree;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Student Id : " + studentId);
        System.out.println("Degree : " + degree.getName());
        System.out.println("Enrolled courses : ");
        for (Course course : coursesEnrolled){
            System.out.println(course.getName());
        }
    }

    //Method for register degree
    public void  registerDegree(Degree degree){
            setDegree(degree);
    }

    //Method to display degree info
    public void displayDegreeInfo(){
        System.out.println("Degree Name : " + getName());
    }

    //Method to enroll course
    public void enrollCourse(Course course){
        coursesEnrolled.add(course);
    }
    //Method to un enroll course
    public void unEnrollCourse(Course unEnroll){
        boolean isUnEnrollCourseSuccessful = false;
        for (Course course : coursesEnrolled){
            if(course.equals(unEnroll)){
                coursesEnrolled.remove(unEnroll);
                isUnEnrollCourseSuccessful =true;
            }
        }
        if (isUnEnrollCourseSuccessful == false){
            System.out.println("You are not enrolled" + unEnroll + " course" );
        }
    }

    //Method to list curses enrolled
    public void  listCoursesEnrolled(){
        System.out.println("Enrolled courses : ");
        for (Course course : coursesEnrolled){
            System.out.println("\t\t" + course);
        }
    }


}
