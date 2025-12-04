public class vid21_05_String_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString()); // output a to z

        builder.reverse();

        System.out.println(builder); // output z to a
    }
}
