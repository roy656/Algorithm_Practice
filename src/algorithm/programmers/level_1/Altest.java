package algorithm.programmers.level_1;

import java.util.ArrayList;
import java.util.Collections;

public class Altest {


    public static void main(String[] args) {



        String ss = "AWAWSSS";

        String answer = "";
        String str = "";

        while (ss.length() > 2) {
            str = ss.replace("AWS", "");
            ss = str;

            if(ss.length() == 0) {
                System.out.println("-1");
            }
        }
        System.out.println(ss);






        int num = 909;


        String s = String.valueOf(num);
        String[] sArr = s.split("");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<sArr.length; i++) {
            list.add(Integer.parseInt(sArr[i]));
            System.out.println(list.get(i));
        }

        int min = Collections.min(list);
        System.out.println("min : " + min);
        int max = Collections.max(list);
        System.out.println("max : " + max);

        int maxNum = Integer.parseInt(s.replace(Integer.toString(min), Integer.toString(max)));
        System.out.println("maxNum : " + maxNum);
        int minNum = Integer.parseInt(s.replace(Integer.toString(max), Integer.toString(min)));
        System.out.println("minNum : " + minNum);

        System.out.println(maxNum - minNum);

    }
}
