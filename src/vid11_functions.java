public class vid11_functions {
    public static void main(String[] args) {
        int[] marks = {90, 85, 78, 92, 88};

        // Print using a for loop
        System.out.println("Marks using for loop:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        // Print using a for-each loop
        System.out.println("\nMarks using for-each loop:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
