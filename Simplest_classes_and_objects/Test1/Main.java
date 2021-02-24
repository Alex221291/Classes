package Task1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Main {
    public static void main(String[] args) {

        Test1 t = new Test1(5.5, 3.3);

        System.out.println(t.toString());

        System.out.println("max(a, b) = " + t.max());

        System.out.println("a + b = " + t.sum());
    }
}
