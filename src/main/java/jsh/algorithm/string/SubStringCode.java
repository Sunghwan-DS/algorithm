package jsh.algorithm.string;

public class SubStringCode {

    public static void main(String[] args) {
        subStringEx();
    }

    private static void subStringEx() {
        String ori = "abcdefg";
        String sub = ori.substring(1, 4);

        System.out.println(sub);
    }
}
