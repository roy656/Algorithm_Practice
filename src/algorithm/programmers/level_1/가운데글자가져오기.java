package algorithm.programmers.level_1;

/*

    가운데 글자 가져오기
    문제 설명
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    재한사항
    s는 길이가 1 이상, 100이하인 스트링입니다.

    입출력 예
    s	return
    "abcde"	"c"
    "qwer"	"we"

 */



public class 가운데글자가져오기 {

    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] sArr = s.split("");
            int length = sArr.length;

            if(length % 2 == 0) {
                answer = sArr[(length/2) -1] + sArr[length/2];
            } else {
                answer = sArr[length/2];
            }

            return answer;
        }
    }
}


// 1등 풀이 ;;

// return word.substring((word.length()-1) / 2, word.length()/2 + 1);