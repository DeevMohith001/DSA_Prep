import java.util.Scanner;

public class vid13_01_Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14, 45, 89, 5, 63, 69};
        System.out.println("Enter the target number: ");
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Number " + target + " is present in the array");
                return;
            }
        }
        System.out.println("Number " + target + " is not in the array");

    }
}
