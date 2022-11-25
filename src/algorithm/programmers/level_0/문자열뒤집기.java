package algorithm.programmers.level_0;

/*

    문자열 뒤집기
    문제 설명
    문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ my_string의 길이 ≤ 1,000

    입출력 예
    my_string	return
    "jaron"	"noraj"
    "bread"	"daerb"

    입출력 예 설명

    입출력 예 #1
    my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
    입출력 예 #2
    my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.

 */


public class 문자열뒤집기 {

    public String solution(String my_string) {
        String answer = "";

        StringBuffer buffer = new StringBuffer(my_string);
        answer = buffer.reverse().toString();

        return answer;
    }

// 반복문 사용
//    public String solution(String my_string) {
//
//        String answer = "";
//        for (int i = my_string.length() - 1; i >= 0; i--) {
//            answer += my_string.charAt(i);
//        }
//
//        return answer;
//    }
}
