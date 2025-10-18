package LB_04.Q_02;

public class UniversityManagementSystem {
    public static void main(String[] args) {


        Department department1 = new Department("Software Engineering");

        Degree degree1 = new Degree("Computer Science",65);
        Degree degree2 = new Degree("Computer Technology",80);
        Degree degree3 = new Degree("Engineering Technology",70);
        Degree degree4 = new Degree("Bio System Technology",50);

        Course course1 = new Course("Object-oriented programming","Compulsory",50);
        Course course2 = new Course("Statistical Inference","Compulsory",60);
        Course course3 = new Course("Advanced Database System","Compulsory",50);
        Course course4 = new Course("Mathematics for computer science 2","Compulsory",50);

        Lecturer lecturer1 = new Lecturer("W.G.Perera","Senior Lecturer",department1);
        Lecturer lecturer2 = new Lecturer("Dias Neomal","Senior Professor",department1);

        Student student1 = new Student("Malith Lakshith","CS2022019",degree1);


        department1.appointDepartmentHead(lecturer2);
        department1.addLecturer(lecturer1);

        degree1.offerCourse(course1);
        degree1.offerCourse(course2);
        degree1.listCoursesOffering();

        course1.addLecturerInCharge(lecturer1);

        lecturer1.addCourse(course1);
        student1.registerDegree(degree1);
        student1.enrollCourse(course3);

        student1.displayInfo();



    }
}