import java.util.ArrayList;

public class vid32_subsetProblems {
    public static void main(String[] args) {
//        subset("", "abc");
        System.out.println(subseqReturn("", "abc"));
    }

    static void subset(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subset(p, up.substring(1));
        subset(p+ch, up.substring(1));
    }

    static  ArrayList<String> subseqReturn(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqReturn(p+ch, up.substring(1));
        ArrayList<String> right = subseqReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}