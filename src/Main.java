//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Student.*;

public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        MarksUtils marks1 = new MarksUtils();
        marks1.addMarks("Математика", "4 3 2 5");
        marks1.addMarks("Русский язык", "2 3 5 1");
        Student student1 = new Student("Илья", "ЭЛЭТ-21", 2, marks1.getMarksList());

        MarksUtils marks2 = new MarksUtils();
        marks2.addMarks("Информатика", "1 3 5 2");
        marks2.addMarks("Технологии программирования", "2 4 5 1");
        Student student2 = new Student("Василий", "ИФСТ-21", 2, marks2.getMarksList());

        MarksUtils marks3 = new MarksUtils();
        marks3.addMarks("Аналитическая геометрия", "2 3 5 5");
        marks3.addMarks("Экономика", "4 4 2 2");
        Student student3 = new Student("Григорий", "ЭКОН-31", 3, marks3.getMarksList());

        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);

        StudentUtils studentUtils = new StudentUtils();
        // Вы можете ввести любой номер курса, чтобы проверить корректность работы функции
        studentUtils.printStudents(studentList.getStudentList(), 2);
        studentUtils.nextCourseTransition(studentList);
    }
}