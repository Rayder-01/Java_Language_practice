package LSP.Car_driver;

class Driver{
    

    private String D_name;
    // private String Car_name;
    
    public Driver(String D_name){
        setD_name(D_name);

    }
    
    public String getD_name(){
        return D_name;
    }
    public void setD_name(String D_name){
        this.D_name = D_name;
    }
    
    // public String getCar_name();{
    //     return D_name;
    // }
    // public String getCar_name(String Car_name);{
    //     this.Car_name = Car_name;
    // }
    

    public String D_All() {
        return D_name;
    }
}
