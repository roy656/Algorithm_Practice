package algorithm.programmers.level_1;

import java.util.HashMap;

public class 완주하지못한선수 {

    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "filipa", "marina"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        HashMap<String, Integer> map = new HashMap<>();

        for(String runner : participant) {
            map.put(runner, 1);
        }
        for(String runner : completion) {
            map.put(runner, map.get(runner) -1);
        }



    }
}
