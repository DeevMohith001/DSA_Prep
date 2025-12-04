public class vid13_q2_SearchIn_range {
    public static void main(String[] args) {
        String name = "Deewalker";
        char target = 'a';
        System.out.println(search(name, target, 1, 4));
    }

    static boolean search(String str, char target, int start, int end){
        if (str.length()==0){
            return false;
        }
        for (int index = start; index <=end ; index++) {
            if (str.charAt(index)==target){
                System.out.println(index);
                return true;
            }
        }
        return false;
    }
}
