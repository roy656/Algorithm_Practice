package algorithm.programmers;

import java.util.Arrays;

public class 최댓값만들기_1 {

    public int solution(int[] numbers) {
        int answer = 0;
        int arr = 0;

        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i != j && numbers[i] * numbers[j] > arr) {
                    arr = numbers[i] * numbers[j];
                }
            }
        }

        answer = arr;
        return answer;
    }


// Arrays.sort() 사용

//    public int solution(int[] numbers) {
//        int answer = 0;
//
//        Arrays.sort(numbers);
//
//        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
//
//        return answer;
//    }

}
