package LB_04.Q_02;

import java.util.ArrayList;

public class Department {
    private String name;
    public Lecturer departmentHead;
    private ArrayList<Course> coursesOffering = new ArrayList<>();
    private ArrayList<Lecturer> lecturersBelongsTo = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Department name : " + name);
        System.out.println("Head of the Department : " + departmentHead.getName());
        System.out.println("Courses offering : ");
        for (Course course : coursesOffering){
            System.out.println("\t" + course);
        }
        System.out.println("Lectures belongs to : ");
        for (Lecturer lecturer : lecturersBelongsTo){
            System.out.println("\t" + lecturer);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void appointDepartmentHead(Lecturer departmentHead ){
        this.departmentHead = departmentHead;
    }

    public void displayDepartmentHeadInfo(){
        departmentHead.displayInfo();
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

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

    public void addLecturer(Lecturer lecturer){
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer removeLec){
        boolean isWithdrawCourseSuccessful = false;
        for (Lecturer lecturer : lecturersBelongsTo){
            if(lecturer.equals(removeLec)){
                coursesOffering.remove(removeLec);
                isWithdrawCourseSuccessful =true;
            }
        }
        if (isWithdrawCourseSuccessful == false){
            System.out.println(removeLec + " is not in " + name + "department" );
        }
    }
}
