package 練習.第二章;

class GrandParent {
    String eyes() {
        return "blue";
    }
    String skin() {
        return "white";
    }
    String hair() {
        return "blond";
    }
}

class Parent extends GrandParent {
    String eyes() {
        return "green";
    }
    String hair() {
        return super.hair();
    }
}

class Child extends Parent {
    String hair() {
        return super.hair();
    }
    String skin() {
        return "yellow";
    }
}

class GrandChild extends Child {
    String hair() {
        return "black";
    }
    String skin() {
        return super.skin();
    }
}

public class Color {
    public static void main(String args[]) {
        GrandParent Jack = new GrandParent();
        Parent Emma = new Parent();
        Child Pam = new Child();
        GrandChild Tom = new GrandChild();
        System.out.println("Jack.eyes(): " + Jack.eyes().equals("blue"));
        System.out.println("Emma.hair(): " + Emma.hair().equals("blond"));
        System.out.println("Pam.eyes(): " + Pam.eyes().equals("green"));
        System.out.println("Pam.hair(): " + Pam.hair().equals("blond"));
        System.out.println("Tom.skin(): " + Tom.skin().equals("yellow"));
        System.out.println("Tom.hair(): " + Tom.hair().equals("black"));
    }
}
