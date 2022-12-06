import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(0,2);
        }
        System.out.println(Arrays.toString(array));
        sort(array);
        ArrayList<Integer>number=new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            number.add(random.nextInt(0,2));
        }
        System.out.println(number);
        sort(number);
        LinkedList<Integer>num=new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            num.add(random.nextInt(0,2));
        }
        System.out.println(num);
        sort(num);
    }
    public static void sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
        }
        System.out.println("Assorted "+Arrays.toString(array));
    }
    public static void sort(ArrayList<Integer>number){
        Collections.sort(number);
        System.out.println("Assorted "+number);
    }
    public static void sort(LinkedList<Integer>num){
        Collections.sort(num);
        System.out.println("Assorted "+num);
    }
}