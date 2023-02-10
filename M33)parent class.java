class ParentClass {
    public void parentMethod() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    public void childMethod() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        parentObj.parentMethod();

        ChildClass childObj = new ChildClass();
        childObj.childMethod();

        ParentClass childObjAsParent = new ChildClass();
        childObjAsParent.parentMethod();
    }
}
