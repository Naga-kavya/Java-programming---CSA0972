class Box {
  double width;
  double height;
  double depth;
  
  Box() {
    width = 10;
    height = 20;
    depth = 30;
  }
  
  double volume() {
    return width * height * depth;
  }
}

public class Main {
  public static void main(String[] args) {
    Box box = new Box();
    System.out.println("Volume of the box is: " + box.volume());
  }
}
