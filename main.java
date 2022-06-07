
public class main {
    public static void main(String args[]) {
        Shape obj1 = new Circle(3);
        Shape obj2 = new Square(4);
        
        System.out.println("圓形面積  :" + obj1.calArea());
        System.out.println("正方形面積:" + obj2.calArea());
    }
}
abstract class Shape {
    abstract double calArea();
}
class Circle extends Shape {
    int radius;
    Circle(int r) {
        this.radius = r;
    }
    double calArea() {
        return radius * radius * 3.14;
    }
}
class Square extends Shape {
    int length;
    Square(int l) {
        this.length = l;
    }
    double calArea() {
        return length * length;
    }
}
