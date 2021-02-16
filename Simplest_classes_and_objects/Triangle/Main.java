package task7;
//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
// вычисления площади, периметра и точки пересечения медиан.

public class Main {
    public static void main(String[] args){
        Triangle triangle = new Triangle(0, 0, 5, 0, 0, 10);
        System.out.println(triangle.toString());
        System.out.println("Perimeter: " + triangle.perimeter());
        System.out.println("Square: " + triangle.square());
        triangle.pointOfIntersectionOfMedians();
    }
}
