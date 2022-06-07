package 練習.第一章;

class Box {
    static int count = 0;
    int length, width, height;
    Box() {
        length = 5;
        width = 6;
        height = 7;
        count++;
    }
    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
        count++;
    }
    int vol() {
        return length * width * height;
    }
    static int getCount() {
        return count;
    }
}

public class Box02 {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(Box.getCount());
        Box box2 = new Box(10, 15, 20);
        System.out.println(Box.getCount());
        System.out.println("vol of box1:" + box1.vol());
        System.out.println("vol of box2:" + box2.vol());
    }
}
