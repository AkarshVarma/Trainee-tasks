public class CountVowels {
    public static void main(String[] args) {
        String s = "hello";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1) c++;
        }
        System.out.println(c);
    }
}

