package Lab1;

public class Classroom {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Edwin ";
        student1.age = 23 ;
        student1.letterGrade = 'A';
        Students student2 = new Students();
        student2.name = "Darius ";
        student2.age = 23 ;
        student2.letterGrade = 'A';
        student1.printStudentinfo();
        student2.printStudentinfo();
    }
}
