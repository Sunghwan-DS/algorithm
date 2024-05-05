package jsh.algorithm.string;

public class Loop {

    public static void main(String[] args) {

        String str = "abcdefg";
        forLoop(str);
    }

    private static void forLoop(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }

    private static void useSplit(String str) {
        for (String s : str.split("")) {
            System.out.println(s);
        }
    }
}
