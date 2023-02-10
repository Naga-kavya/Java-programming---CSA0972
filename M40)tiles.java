import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int numTilePossibilities(String tiles) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return dfs(map);
    }
    
    private static int dfs(HashMap<Character, Integer> map) {
        int count = 0;
        for (char c : map.keySet()) {
            if (map.get(c) > 0) {
                count++;
                map.put(c, map.get(c) - 1);
                count += dfs(map);
                map.put(c, map.get(c) + 1);
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the tiles: ");
        String tiles = sc.next();
        System.out.println("Number of possible non-empty sequences: " + numTilePossibilities(tiles));
        sc.close();
    }
}
