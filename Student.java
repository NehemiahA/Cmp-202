package User;

public class Student extends User {
    String matric_no = "bhu/22/04/09/0023";
    String admission_no = "1789237958103";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result. Are you even a student?";
        } else {
            return "You got 6As and 10Ds";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Nehemiah Andrew";
        student.password = "Falcon123";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
