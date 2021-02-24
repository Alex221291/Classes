package Student;

import java.util.Arrays;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Student {
    private String name;
    private int groupNumber;
    int []marks = new int[5];
    public Student(String name, int groupNumber, int[] marks) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }
    public void honorsStudents() {
        int minMarks = marks[0];
        int i = 1;
        while ((minMarks >= 9) && (i < marks.length)) {
            if (minMarks > marks[i]) {
                minMarks = marks[i];
            }
            i++;
        }
        if (minMarks >= 9) {
            System.out.println(toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name +
                ", " + groupNumber +
                ", " + Arrays.toString(marks);
    }
}

