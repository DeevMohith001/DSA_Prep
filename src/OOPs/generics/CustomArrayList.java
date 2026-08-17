package OOPs.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    public static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];

        // copy the current element in the new array
        for (int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
        for (int i=0; i<14; i++){
            list.add(2*i);
        }

        System.out.println(list.toString());
        System.out.println(list.size);

        ArrayList<Integer> list1= new ArrayList<>(); // it will show error if we pass another data type except integers, these are generics.
//        list1.add("ngh");
    }
}
