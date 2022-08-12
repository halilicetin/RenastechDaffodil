package student.HalilCetin;

import java.util.Arrays;

public class lab02 {
    public static void main(String[] args) {
        System.out.println(compareIfStringsContainsSameLetters("abc", "cba"));
        System.out.println(compareIfStringsContainsSameLetters("aaa", "aac"));
    }
    public static String compareIfStringsContainsSameLetters(String firstLetters,String secondLetters){
        char [] chr1= firstLetters.toCharArray();
        char [] chr2=secondLetters.toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        if (Arrays.equals(chr1,chr2)){
            return "these to strings are made out of same characters";
        }else {
            return "these to strings are not made out of same characters";
        }


    }
}
