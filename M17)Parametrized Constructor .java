class SuperClass {
  int x;

  SuperClass(int x) {
    this.x = x;
  }
}

class SubClass extends SuperClass {
  int x;

  SubClass(int x1, int x2) {
    super(x1);
    this.x = x2;
  }

  void display() {
    System.out.println("x in super class: " + super.x);
    System.out.println("x in sub class: " + x);
  }
}

public class NameHiding {
  public static void main(String[] args) {
    SubClass obj = new SubClass(100, 200);
    obj.display();
  }
}
