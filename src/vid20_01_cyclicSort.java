public class vid20_01_cyclicSort {
    public static void main(String[] args) {

    }
    static void cyclic(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap1(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap1(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
