import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4};
    int[] array2 = {2, 4, 5, 6, 7};
    
    List<Integer> commonElements = getCommonElements(array1, array2);
    
    System.out.println("Common Elements: " + commonElements);
  }
  
  public static List<Integer> getCommonElements(int[] array1, int[] array2) {
    List<Integer> commonElements = new ArrayList<>();
    
    for (int element1 : array1) {
      for (int element2 : array2) {
        if (element1 == element2) {
          commonElements.add(element1);
        }
      }
    }
    
    return commonElements;
  }
}
