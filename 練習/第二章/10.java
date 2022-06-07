package 練習.第二章;

class GrandParent {
    String eyes() {
        return "blue";
    }
    String test1() {
        return this.eyes();
    }
}

class Parent extends GrandParent {
    String eyes() {
        return "green";
    }
    String test2() {
        return super.eyes();
    }
}

class Child extends Parent {
    String test3() {
        return this.eyes();
    }
    String test4() {
        return super.eyes();
    }
}

public class Generation {
    public static void main(String args[]) {
        GrandParent gail = new GrandParent();
        Parent sue = new Parent();
        Child maggie = new Child();
        System.out.println("gail.eyes(): " + gail.eyes().equals("____"));
        System.out.println("sue.eyes(): " + sue.eyes().equals("____"));
        System.out.println("maggie.eyes(): " + maggie.eyes().equals("____"));
        System.out.println("maggie.test1(): " + maggie.test1().equals("____"));
        System.out.println("maggie.test2(): " + maggie.test2().equals("____"));
        System.out.println("maggie.test3(): " + maggie.test3().equals("____"));
        System.out.println("maggie.test4(): " + maggie.test4().equals("____"));
    }
}
