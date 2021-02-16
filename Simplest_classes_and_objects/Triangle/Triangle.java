package task7;

import java.util.Objects;

public class Triangle {
    double xA;
    double yA;
    double xB;
    double yB;
    double xC;
    double yC;

    public Triangle() {
            this.xA = 1;
            this.yA = 1;
            this.xB = -1;
            this.yB = 1;
            this.xC = 0;
            this.yC = -2;
    }

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
        if ((xB - xA) * (yC - yA) != (xC - xA) * (yB - yA)) {
            this.xA = xA;
            this.yA = yA;
            this.xB = xB;
            this.yB = yB;
            this.xC = xC;
            this.yC = yC;
        }
        else {
            this.xA = 0;
            this.yA = 0;
            this.xB = 0;
            this.yB = 10;
            this.xC = 10;
            this.yC = 0;
        }
    }

    public double sideA() {
        return Math.sqrt(Math.pow(this.xB - this.xC,2) + Math.pow(this.yB - this.yC,2));
    }

    public double sideB() {
        return Math.sqrt(Math.pow(this.xA - this.xC,2) + Math.pow(this.yA - this.yC,2));
    }

    public double sideC() {
        return Math.sqrt(Math.pow(this.xB - this.xA,2) + Math.pow(this.yB - this.yA,2));
    }

    public double perimeter() {
        return sideA() + sideB() + sideC();
    }

    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p -sideA()) * (p - sideB()) * (p - sideC()));
    }

    public double xPointOfIntersectionOfMedians() {
        return (this.xA + this.xB + this.xC) / 3;
    }

    public double yPointOfIntersectionOfMedians() {
        return (this.yA + this.yB + this.yC) / 3;
    }

    public void pointOfIntersectionOfMedians() {
        System.out.println("Point of intersection of medians: (" +
                xPointOfIntersectionOfMedians() + ", " + yPointOfIntersectionOfMedians() + ")");
    }

    public double getXA() {
        return xA;
    }

    public void setXA(double xA) {
        this.xA = xA;
    }

    public double getYA() {
        return yA;
    }

    public void setYA(double yA) {
        this.yA = yA;
    }

    public double getXB() {
        return xB;
    }

    public void setXB(double xB) {
        this.xB = xB;
    }

    public double getYB() {
        return yB;
    }

    public void setYB(double yB) {
        this.yB = yB;
    }

    public double getXC() {
        return xC;
    }

    public void setXC(double xC) {
        this.xC = xC;
    }

    public double getYC() {
        return yC;
    }

    public void setYC(double yC) {
        this.yC = yC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.xA, xA) == 0 && Double.compare(triangle.yA, yA) == 0 && Double.compare(triangle.xB, xB) == 0 && Double.compare(triangle.yB, yB) == 0 && Double.compare(triangle.xC, xC) == 0 && Double.compare(triangle.yC, yC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xA, yA, xB, yB, xC, yC);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A(" + xA +
                ", " + yA +
                "), B(" + xB +
                ", " + yB +
                "), C(" + xC +
                ", " + yC +
                ")}";
    }

}
