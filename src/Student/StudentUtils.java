package Student;

import java.util.ArrayList;
import java.util.Map;

public class StudentUtils {
    public void printStudents(ArrayList<Student> students, int course){
        boolean findStatus = true;
        System.out.println("Список всех студентов " + course + "-го курса");
        for (Student student : students){
            if (student.getCourse() == course){
                findStatus = false;
                System.out.println("--------------------------------\nИмя студента: " + student.getStudentName());
                System.out.println("Название группы: " + student.getGroupName());
                for (Map.Entry<String, ArrayList<Integer>> marksList : student.getMarks().entrySet()){
                    StringBuilder sb = new StringBuilder();
                    for (Integer mark : marksList.getValue()){
                        sb.append(mark);
                        sb.append(" ");
                    }
                    System.out.println(marksList.getKey() + ": " + sb.toString());
                }
            }
        }
        if (findStatus) System.out.println("--------------------------------\nТаких студентов нет!");
    }

    public void nextCourseTransition(StudentList studentList){
        ArrayList<Integer> deleteList = new ArrayList<>();
        System.out.println("--------------------------------");

        for (int i = 0; i < studentList.getStudentList().size(); i++){
            int sum = 0, len = 0;
            for (Map.Entry<String, ArrayList<Integer>> marksList : studentList.getStudentList().get(i).getMarks().entrySet()){
                for (Integer mark : marksList.getValue()){
                    sum += mark;
                }
                len += marksList.getValue().size();
            }
            double avg = (double) sum / len;
            if (avg < 3){
                deleteList.add(i);
                System.out.println("Студент №" + (i + 1) + " удалён из списка! Cр. балл: " + avg);
            }
            else{
                System.out.println("Студент №" + (i + 1) + " переводится на следующий курс! Cр. балл: " + avg);
            }
        }

        for (Integer del : deleteList){
            studentList.deleteStudentByIndex(del);
        }
    }
}
