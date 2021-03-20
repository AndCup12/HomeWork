package ru.geekbrains_lesson2;

public class homeWork_2 {
    public static void main(String[] args) {
        int[] ARR = {0, 1, 1, 1, 0, 1, 0, 0};
        for (int i = 0; i < ARR.length; i++) {
            ARR[i] = (ARR[i] == 0 ? 1 : 0);
            System.out.print(ARR[i]);
            System.out.println();
        }


        int[] ARR1 = new int[8];
        for (int i = 0, a = 0; i < ARR1.length; i++, a += 3) {
            ARR1[i] += ARR1[i] + a;
            System.out.print(ARR1[i]);
            System.out.println();
        }

        int[] ARR2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ARR2.length; i++) {
            if (ARR2[i] < 6) {
                ARR2[i] = ARR2[i] * 2;
            }
            System.out.println(ARR2[i]);
        }


        int[][] ARR3 = new int[4][4];
        for (int y = 0; y < ARR3.length; y++) {
            for (int x = 0; x < ARR3[y].length; x++) {
                if (x == y) {
                    ARR3[y][x] = 1;
                }
                if (y + x == 3) {
                    ARR3[y][x] = 1;
                }
                System.out.println(ARR3[y][x] + " ");
            }
        }

        int[] ArrX = {1, 16, 5, 8, 66, 25, 9, 1, 2, 2, 75, 30}; // 12
        int n = 5;
        for (int i = 0; i < ArrX.length; i++) {
            if (0 < n && n <= ArrX.length) {
                ArrX[i] = ArrX[i + n];
            }
            else if (0>n && n<= ArrX.length){
                ArrX[i] = ArrX[(-1)*(i+n)];
        }
            System.out.println(ArrX[i]);
        }
    }
}



