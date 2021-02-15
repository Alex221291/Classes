package task5;
//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class Main {
    public static void main(String[] args){
        DecimalCounter counter = new DecimalCounter();
        System.out.println("Default Constructor:");
        counter.print();
        counter.increment();
        counter.print();
        counter.decrement();
        counter.print();
        DecimalCounter counterD = new DecimalCounter(20,21,21);
        System.out.println("\nConstructor with parameters:");
        counterD.print();
        counterD.increment();
        counterD.print();
        counterD.decrement();
        counterD.print();
    }
}
