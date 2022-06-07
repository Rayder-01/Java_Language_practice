package 練習.第二章;

class Circle {
    private int radius;
    Circle (int r) {
        radius = r;
    }
    public double area() {
        return radius * radius * 3.14;
    }
}

class Cylinder extends Circle {
    private int height;
    Cylinder(int r, int h) {
        super(r);
        height = h;
    }
    public double volume() {
        return this.area() * height;
    }
}

public class CylinderMain {
    public static void main (String args[]) {
        Cylinder c = new Cylinder(3, 5);
        System.out.println("Area: " + c.area());
        System.out.println("Volume: " + c.volume());
    }
}

/*** ======================================================================================
   
1. 上一題使用 super.area() 的方式呼叫，這題使用 this.area() 方式還是可以呼叫，因為 this 會
   先抓此 class 的 area() 方法，但是在 Cylinder 並沒有 area() 方法，所以會抓到父類的 area()

***/