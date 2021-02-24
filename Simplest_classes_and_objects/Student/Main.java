package Student;

public class Main {
    public static void main(String[] args) {
        Student[]students = new Student[10];
        students[0] = new Student("Афтухов А.А.", 7, new int[]{9, 9, 8, 9, 10});
        students[1] = new Student("Афтухова Я.А.", 10, new int[]{10, 10, 10, 10, 10});
        students[2] = new Student("Воронко К.П.", 59, new int[]{10, 9, 10, 6, 7});
        students[3] = new Student("Луканев А.М.", 11, new int[]{10, 10, 10, 10, 10});
        students[4] = new Student("Луканева А.О.", 11, new int[]{9, 10, 10, 9, 10});
        students[5] = new Student("Колочев С.В.", 13, new int[]{10, 9, 10, 10, 10});
        students[6] = new Student("Соколов А.Ю.", 13, new int[]{5, 9, 10, 7, 10});
        students[7] = new Student("Пищейко Ю.В.", 11, new int[]{9, 9, 9, 9, 9});
        students[8] = new Student("Иванов И.И", 7, new int[]{4, 4, 4, 4, 4});
        students[9] = new Student("Петрова П.П.", 7, new int[]{2, 2, 2, 2, 2});
        for (int i = 0; i < students.length; i++) {
            students[i].honorsStudents();
        }
    }
}
