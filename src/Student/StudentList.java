package Student;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> studentList;

    public StudentList(){
        studentList = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void deleteStudentByIndex(int index){
        studentList.remove(index);
    }
}
