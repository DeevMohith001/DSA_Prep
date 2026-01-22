public class vid32_SkipA {
    public static void main(String[] args) {
//        skipA("", "baccdah");
//        System.out.println(skipA("baaccdas"));
        System.out.println(skipAppNotApple("bdsapplecapps"));
    }

    static void skipA(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skipA(p, up.substring(1));
        } else {
            skipA(p + ch, up.substring(1));
        }
    }

    // here we are returning string
    static String skipA(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skipA(up.substring(1));
        } else {
            return ch + skipA(up.substring(1));
        }
    }

    // here we are skipping whole string which is Apple
    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return ch + skipApple(up.substring(1));
        }
    }

    // here we are skipping app but not apple
    static String skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return ch + skipAppNotApple(up.substring(1));
        }
    }
}
