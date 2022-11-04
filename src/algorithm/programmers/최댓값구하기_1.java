package algorithm.programmers;

import java.util.Arrays;
import java.util.Collections;

public class 최댓값구하기_1 {

    public static void main(String[] args) {
        int[] numbers = {4,6,2,5,1,3};
        Integer[] arr = new Integer[numbers.length];
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {

            arr[i] = numbers[i];
        }

        answer = arr[0] * arr[1];


        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[0] * arr[1]);
        System.out.println(answer);
    }
}
