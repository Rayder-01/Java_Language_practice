package LSP.Car_driver;
public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("1_sir");   
        Car car1 = new Car("BMW", driver1);


        System.out.println(car1.D_All());
        // Driver.getCar_name("BBcar");
        // Driver.getCar_name();        
    //   System.out.println("Sum of x+y = " );
    }
}