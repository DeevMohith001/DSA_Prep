import java.util.ArrayList;

public class vid28_02_Linear_searchRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 2, 18, 18, 9};
        System.out.println(search(arr, 4, 0));
        System.out.println(searchIndex(arr, 18, 0));
        System.out.println(searchIndexLast(arr, 2, arr.length-1));
        searchAllIndex(arr, 18, 0);
        System.out.println(list);
    }

    static boolean search(int[] arr, int target, int index){
        if (index == arr.length-1){
            return false;
        }
        return arr[index] == target || search(arr, target, index+1);
    }

    // return index
    static int searchIndex(int[] arr, int target, int index){
        if (index == arr.length-1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        } else {
            return searchIndex(arr, target, index+1);
        }
    }

    //find index from last
    static int searchIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return searchIndexLast(arr, target, index - 1);
        }
    }

    // find all index
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAllIndex(int[] arr, int target, int index){
        if (index == arr.length-1){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        searchAllIndex(arr, target, index+1);
    }
}


