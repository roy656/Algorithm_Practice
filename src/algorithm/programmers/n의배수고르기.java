package algorithm.programmers;

import java.util.ArrayList;

/*

    n의 배수 고르기
    문제 설명
    정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ n ≤ 10,000
    1 ≤ numlist의 크기 ≤ 100
    1 ≤ numlist의 원소 ≤ 100,000

    입출력 예
    n	numlist	result
    3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
    5	[1, 9, 3, 10, 13, 5]	[10, 5]
    12	[2, 100, 120, 600, 12, 12]	[120, 600, 12, 12]

    입출력 예 설명

    입출력 예 #1
    numlist에서 3의 배수만을 남긴 [6, 9, 12]를 return합니다.
    입출력 예 #2
    numlist에서 5의 배수만을 남긴 [10, 5]를 return합니다.
    입출력 예 #3
    numlist에서 12의 배수만을 남긴 [120, 600, 12, 12]를 return합니다.

 */


public class n의배수고르기 {

    public int[] solution(int n, int[] numlist) {

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i : numlist) {
            if(i % n == 0) {
                arr.add(i);
            }
        }

        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }


        /*

        다른풀이
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();


        get() 을 이용한 풀이
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0;i < numlist.length; i++){
            if(numlist[i] % n == 0){
                List.add(numlist[i]);}}
            int[] answer = new int[List.size()];
            for(int i = 0; i< List.size(); i++){
                answer[i] = List.get(i);
                }
        return answer;

         */

    }
