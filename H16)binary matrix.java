import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0}, 
                       {1, 1, 1, 1, 0}, 
                       {1, 0, 0, 0, 0}, 
                       {1, 1, 0, 0, 0}, 
                       {1, 1, 1, 1, 1}};
        int k = 3;
        int[] res = kWeakestRows(mat, k);
        System.out.print("The indices of the k weakest rows in the matrix ordered from weakest to strongest: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            list.add(new int[] {i, count});
        }
        list.sort((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i)[0];
        }
        return res;
    }
}

