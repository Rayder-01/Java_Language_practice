package Class_OOP.Association.Aggriation;

class Principal {
    public String principalname;
    // private String principalname;
	public Principal() {
        principalname ="";
	}
	public Principal(String principalname) {
		set_principalname(principalname);
	}
	public void set_principalname(String name) {
		this.principalname = name;
	}
    public String get_principalname(){
        return principalname;    
    }
    
}


class School {
    public String schoolName;

    public String principalname; 

    public void hire(String p){
        return p;
    }
}

class Main {
    public static void main(String[] args) {
        School Yuntech = new School();

        Yuntech.hire("TheCat");
    }
}