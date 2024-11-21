/*
Utwórz klasę Point z dwoma polami: x i y reprezentującymi współrzędne na płaszczyźnie.
Napisz metodę distance(Point otherPoint), która oblicza odległość między bieżącym punktem a innym punktem.
Stwórz przypadek testowy, aby wywołać metodę co najmniej jeden raz.
*/

public class Main {
    public static void main(String[] args) {
    Point point1 = new Point(3,4);
    Point point2 = new Point(0,0);
    System.out.println(point1.distance(point2));
    }
}

public class Point{
    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point otherPoint){
        return Math.sqrt(Math.pow(otherPoint.x - this.x, 2) + Math.pow(otherPoint.y - this.y, 2));
    }
}
