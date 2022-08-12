package student.HalilCetin;

public class lab03 {
    public static void main(String[] args) {
        System.out.println(removeDuplicatedValues("AAABBBCCC"));
    }
    public static String removeDuplicatedValues(String a){
        String result="";
        for (int i = 0; i < a.length(); i++) {
            if( ! (result.contains(""+a.charAt(i)))){
                result +=a.charAt(i);
            }
        }
        return result;
    }
}
