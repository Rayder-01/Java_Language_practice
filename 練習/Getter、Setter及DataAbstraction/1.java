class Box {
    int length, width, height;
    Box() {
        length = 5;
        width = 6;
        height = 7;
    }
    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
    int vol() {
        return length * width * height;
    }
}

public class Box01 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(10, 15, 20);
        System.out.println("vol of box1:" + box1.vol());
        System.out.println("vol of box2:" + box2.vol());
    }
}