package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите высоту треугольника: ");
        Scanner height = new Scanner(System.in);
//        int n = 0;
        int max = height.nextInt();

//        while (n < max) {
//            String tab = "";
//            int star = 0;


//            for (int j = 0; j < max - n; j++) {
//                tab += " ";
//            }
            int [][] triangle = new int [max][];
            for (int i = 0; i < max; i++) {

                triangle [i] = new int [i + 1];

                triangle [i][0] = 1;
                triangle [i][i] = 1;
                for (int j = 1; j < i; j++){
                    triangle [i][j] = triangle [i - 1][j - 1] + triangle [i - 1] [j];
                }
            }
          /*  for (int k = 0; k < n + 1; k++) {
                int i = 1;
                int f = 1;
                int s = 1;
                int r = (f - s) * i;
                if (n == 0) {
                    f = 1;
                    s = 1;
                    r = 1;
                } else if (n == 1) {
                    f = 1;
                    s = 1;
                    r = 1;
                } else if (n > 1) {
                    i ++;
                    f *= i;
                    s *= i;
                    r = (f - s) * i;
                }
                star += f / (s * r);
            }*/
          for (int i = 0; i < max; i++) {
              for (int j = 0; j < i + 1; j++) {
                  System.out.print(triangle [i][j] + " ");
              }
              System.out.println();
          }

//            System.out.println(tab + star);
//          n++;
        }
    }

