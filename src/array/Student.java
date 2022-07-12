package array;

public class Student {
    private String studentID;
    private String name;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println(studentID+","+name);
    }
}
