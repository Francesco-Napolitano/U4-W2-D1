package Es1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arrays = new int[5][10];

        for (int i = 0; i < arrays.length; i++)
            for (int j = 0; j < arrays[0].length; i++)
                arrays[i][j] = (int) (Math.random() * 10) + 1;
        System.out.println(Arrays.deepToString(arrays));
    }
}

