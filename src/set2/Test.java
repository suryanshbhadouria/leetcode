package set2;

public class Test {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 45550; i++) {
            char ch = (char) ((i % 26) + 97);
            if (ch != 'a')
                str += ch;
        }
        str += 'a';
        System.out.println(str);
    }
}
