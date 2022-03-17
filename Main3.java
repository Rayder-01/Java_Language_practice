// === 有意義繼承版 ====
class Shape {
    public String Allshape;
    void area(String Allshape,int x, int y) {
    System.out.println("形狀:"+Allshape+",面積:"+x*y);              
        
    }
}
 
class square extends Shape {
    void area(int x, int y) {
        if(x==y){
            String Allshape = "正方形";
            super.area(Allshape,x,y);
        }
        else{
            System.out.println("error:X必須和Y相同,請重新輸入");            
            return;
        }
    }
}
class Rectangle extends Shape {
    void area(int x, int y) {
         if(x!=y){
            String Allshape = "長方形";
            super.area(Allshape,x,y);
        }
        else{
            System.out.println("error:X必須和Y不同,請重新輸入");            
            return;
        }
    }
}
 
public class Main3 {
    public static void main(String[] args) {
    // Shape A_shape = new Shape();
    // A_shape.area("正方形或長方形",50,2);
    // A_shape.area("正方形或長方形",10,10);
    square B_square = new square();
    B_square.area(50,2);
    B_square.area(10,10);
    Rectangle C_Rectangle = new Rectangle();
    C_Rectangle.area(50,2);
    C_Rectangle.area(10,10);
    }
}
