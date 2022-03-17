
// ==== 詳細繼承版 ===

class Shape {
    public int x;
    public int y;
    void area(int x, int y) {
        System.out.println("Shape無繼承,"+"x="+x+" y="+y);
        System.out.println("形狀:正方形或是正方形"+",面積:"+x*y);  
    }
}
 
class square extends Shape {
    void area(int x, int y) {
        System.out.println("square繼承Shape,"+"x="+x+" y="+y);
        if (x==y){
        System.out.println("形狀:正方形"+",面積:"+x*y);            
        }
        else {
        System.out.println("請使用長方形(Rectangle)函式,或x,y只能為相同");              
        }
    }
}
class Rectangle extends Shape {
    void area(int x, int y) {
        System.out.println("Rectangle繼承Shape,"+"x="+x+" y="+y);
        if (x!=y){
        System.out.println("形狀:長方形"+",面積:"+x*y);            
        }
        else {
        System.out.println("請使正方形(square)函式,或x,y不能為相同");              
        }
    }
}
 
public class Main1 {
    public static void main(String[] args) {
    Shape A_shape = new Shape();
    A_shape.area(50,2);
    A_shape.area(10,10);
    square B_square = new square();
    B_square.area(50,2);
    B_square.area(10,10);
    Rectangle C_Rectangle = new Rectangle();
    C_Rectangle.area(50,2);
    C_Rectangle.area(10,10);
    }
}