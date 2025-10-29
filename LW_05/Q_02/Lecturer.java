package LW_05.Q_02;

import java.util.ArrayList;

public class Lecturer extends Person{
    private String position;
    public Department department;
    private ArrayList<Course> courseTeaching = new ArrayList<>();

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Position : " + getPosition());
        System.out.println("Department : " + department.getName());
        System.out.println("Teaching Courses : ");
        for (Course course: courseTeaching){
            System.out.println("\n" + course.getName());
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void displayDepartmentInfo(){
        department.displayInfo();
    }

    public void addCourse(Course course){
        courseTeaching.add(course);
    }

    public void removeCourse(Course course){
        courseTeaching.remove(course);
    }

    public void listCoursesTeaching(){
        for(Course course : courseTeaching){

        }
    }


}
