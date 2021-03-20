package ru.geekbrains_lesson2;

public class Classwork2 {
    //    switch
//    while
//    do while
//    for
//    arrays
//    foreach
    public static void main(String[] args) {
        int a = 1;
        int a1 = 3;
        int b = 1;
        int c = 20;
        int d = 500;
        int e = 1050;

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

        int cArr[] = new int[5];

        int[] arr1 = {1, 2, 3, 4, 5, 6, 8, 50};
        String[] strings = new String[10];
        String[] strings1 = {"one", "two", "three", "four", "five"};

        System.out.println(strings1[2]);

        System.out.println(arr1.length); // length - показывает длинну массива

        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 != 0) continue;
                sum1 += arr1[i];
                System.out.println("Current sum is: " + sum1);
            }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 0) continue;
            System.out.println(arr[i]);
        }

            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]);
                if (arr1[i] == 51) {
                    System.out.println("Found 51");
                    break;

                }
            }

            int[][] arr2 = new int[3][3];
            int[] arr3 = {1,2,3};
            String[] string = {""};

            for (int i : arr3) {
                System.out.print(i + " ");
            }

        System.out.println();

            for (int y = 0; y < arr2.length; y++) {
                for (int x = 0; x < arr2[y].length; x++) {   //проходит по двумерному массиву и выводит данные
                    System.out.print(arr2[y][x] +  " ");
                }
                System.out.println();
            }
            for (int aa : arr1) {
                System.out.println(aa);
            }





//        цикл с предусловием
//        while (a != 80) {
//            System.out.println(a++);
//            if (a == 50) break;
//
//            do {
//                System.out.println(a++); //  цикл с постусловием
//            } while (a > 50);
//        //        инициализация                условие         итерация
//        for (int i = 0, j = 10, k = 50; i < 20; i++, j += 2, k--) {
//            //%d - int, %f - floating, %s - String, %% -> %, %b -> boolean
//            System.out.printf("i= %d, j= %d, k =%d\n", i, j, k);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
////        for (int i = 0; ; i++) {
////            System.out.println(i);
////        }
//
//
////        private static void switchExample() {
////
////            if (a1 == 0) a = 1;
////            else a1 = 0;
////
////            a1 = (a1 == 0 ? 1 : 0);  // тернарный оператор
////            System.out.println(a1);
////            // switch
////            String recipient = "Andrey";
////
////            if (recipient.equals("Ivan")) System.out.println("положить в ящик № 1");
////            else if (recipient.equals("Vladimir")) System.out.println("положить в ящик № 2");
////            else if (recipient.equals("Kolya")) System.out.println("положить в ящик № 3");
////            else if (recipient.equals("Danya")) System.out.println("положить в ящик № 4");
////            else System.out.println("Положи обратно в сумку");
////
////            switch (recipient) {
////                case "Andrey":
////                    System.out.println("положить в ящик № 1");
////                    break;
////                case "Vlad":
////                    System.out.println("положить в ящик № 2");
////                    break;
////                case "Oleg":
////                    System.out.println("положить в ящик № 3");
////                    break;
////                case "Kolya":
////                    System.out.println("положить в ящик № 4");
////                    break;
////                default:
////                    System.out.println("Ничего");
////            }
////            switch (recipient) {
////                case "Vlad" -> System.out.println("положить в ящик № 2");
////                case "Andrey" -> System.out.println("положить в ящик № 1");
////                case "Oleg" -> System.out.println("положить в ящик № 3");
////                case "Kolya" -> System.out.println("положить в ящик № 4");
////                default -> System.out.println("Ничего");
////
////            }
////        }
//    }
    }
}



