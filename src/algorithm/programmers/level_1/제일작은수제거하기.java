package algorithm.programmers.level_1;

import java.util.ArrayList;


/*

    제일 작은 수 제거하기
    문제 설명
    정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

    제한 조건
    arr은 길이 1 이상인 배열입니다.
    인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

    입출력 예
    arr	return
    [4,3,2,1]	[4,3,2]
    [10]	[-1]

 */

// 아직 미해결
public class 제일작은수제거하기 {

    public int[] solution(int[] arr) {

        int[] answer = new int[arr.length - 1];
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            list.add(num);
        }
        list.remove((Integer) min);

        if (list.isEmpty()) {
            answer = new int[]{-1};
            return answer;
        } else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}