package 練習.第二章;

class Rectangle {
    private int width, length;
    Rectangle (int w, int l) {
        width = w;
        length = l;
    }
    public int area() {
        return width * length;
    }
}

class Cuboid extends Rectangle {
    private int height;
    Cuboid (int w, int l, int h) {
        super(w, l);
        height = h;
    }
    public int volume() {
        return super.area() * height;
    }
}

public class CuboidMain {
    public static void main (String args[]) {
        Rectangle r = new Rectangle(3, 4);
        System.out.println("Area: " + r.area());
        Cuboid c = new Cuboid(3, 4, 5);
        System.out.println("Area: " + c.area());
        System.out.println("Volume: " + c.volume());
    }
}

/*** ======================================================================================
   
1. super(變數, 變數) -> 傳入變數至父類的 constructor

2. 透過 super.變數、super.方法 可以調用父類的變數及方法

***/ 