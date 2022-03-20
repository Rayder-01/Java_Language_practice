package LSP.Car_driver;

class Car{
    
    private Driver driver;
    private String Car_name;
    public Car(){
        Car_name = "";
        driver = null;
    }
    //overloaded constructor
    public Car(String Car_name,Driver driver){
        setCar_name(Car_name);
        setDriver(driver);
    }
    
    public String getCar_name(){
        return Car_name;    
    }
    public void setCar_name(String Car_name){
        this.Car_name = Car_name;
    }
    
    public Driver getDriver(){
        return driver;
    }
    
    public void setDriver(Driver driver){
        this.driver = driver;
    }
    
    public String D_All(){
        return "汽車名稱:"+Car_name +"     駕駛人: "+driver.D_All();
    }
}