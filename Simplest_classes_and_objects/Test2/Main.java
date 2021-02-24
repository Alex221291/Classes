package Test2;

public class Main {
    public static void main(String[] args) {
    Test2 t = new Test2(3.3, 5.5);
    System.out.println(t.toString());

    Test2 t2 = new Test2();
    System.out.println(t2.toString());
    t2.setA(1.1);
    t2.setB(2.2);
    System.out.println(t2.toString());
    }
}
