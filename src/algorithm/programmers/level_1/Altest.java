package algorithm.programmers.level_1;

import java.util.*;

public class Altest {


    public static void main(String[] args) {

        int n = 5;

        System.out.println();
        System.out.println("===============직각삼각형");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("===============역직각삼각형");
        System.out.println();


        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=============== 피라미드");
        System.out.println();

        for(int i=0; i<n; i++) {
            for(int j=1; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("===============달팽이찍기");
        System.out.println();

    }
}