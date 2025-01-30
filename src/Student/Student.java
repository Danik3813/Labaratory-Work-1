package Student;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentName;
    private String groupName;
    private int course;
    private HashMap<String, ArrayList<Integer>> marks;

    public Student(String studentName, String groupName, int course, HashMap<String, ArrayList<Integer>> marks) {
        this.studentName = studentName;
        this.groupName = groupName;
        this.course = course;
        this.marks = marks;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public void setCourse(int course){
        this.course = course;
    }

    public void setMarks(HashMap<String, ArrayList<Integer>> marks){
        this.marks = marks;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getGroupName(){
        return groupName;
    }

    public int getCourse(){
        return course;
    }

    public HashMap<String, ArrayList<Integer>> getMarks(){
        return marks;
    }

}
