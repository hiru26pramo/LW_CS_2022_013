package LB_04.Q_02;

public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    public Lecturer lecturerInCharge;
    public Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }
    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Enroll Type : " + enrollType);
        System.out.println("Number of Students enrolled : " + numberOfStudentsEnrolled);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturerInCharge){
        this.lecturerInCharge = lecturerInCharge;
    }

    public void removeLecturerInCharge(){
       this.lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degreeBelongsTo){
        this.degreeBelongsTo = degreeBelongsTo;
    }

    public void removeDegreeBelongsTo(){
        this.degreeBelongsTo = null;
    }

}
