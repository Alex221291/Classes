package Task1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
//Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Test1 {
    private double a;
    private double b;

    public Test1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum(){
        return a + b;
    }

    public double max(){
        return Math.max(a, b);
    }

    @Override
    public String toString() {
        return "a = " + a + ", b = " + b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

