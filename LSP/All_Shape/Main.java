package LSP.All_Shape;

class Shape {

    void shape_name(){
		System.out.println("無法確定形狀");  
    }
    void area(int x, int y){
		System.out.println("面積="+x*y+",x="+x+",y="+y);
    }
}
 
class square extends Shape {
    
    public void shape_name() { 
        System.out.println("形狀:正方形"); 
    } 
    
    public void area(int x, int y) {
        if(x==y){
            super.area(x,y);
        } 
        else{
          	System.out.println("不符合正方形參數"+"(x="+x+",y="+y+")");  
        }
    } 
    
}
class Rectangle extends Shape {
    
    public void shape_name() { 
        System.out.println("形狀:長方形"); 
    } 
    
    public void area(int x, int y) {
        if(x!=y){
            super.area(x,y);
        } 
        else{
          	System.out.println("不符合長方形參數"+"(x="+x+",y="+y+")");  
        }
    } 
}
 
public class Main {
    public static void main(String[] args) {
    Shape A_shape = new Shape();
    A_shape.shape_name();
    A_shape.area(50,2);
    A_shape.area(10,10);
	System.out.println("======================");
    square B_square = new square();
    B_square.shape_name();
    B_square.area(50,2);
    B_square.area(10,10);
	System.out.println("======================");    
    Rectangle C_Rectangle = new Rectangle();
    C_Rectangle.shape_name();
    C_Rectangle.area(50,2);
    C_Rectangle.area(10,10);
    }
}

