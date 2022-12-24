import java.util.ArrayList;
import java.util.ArrayDeque;

public class Arraylist_Arraydeque {
    public static void main(String[] args) {
        // Membuat object ArrayList untuk menyimpan data String
        ArrayList<String> arraylist = new ArrayList<>();
        
        // Menambahkan beberapa elemen ke ArrayList
        arraylist.add("Say");
        arraylist.add("Hi");
        arraylist.add("To world");
        
        //Menampilkan elemen ArrayList menggunakan loop for
        for(String str : arraylist){
            System.out.println(str);
        }
        
        // Membuat objek ArrayDeque untuk menyimpan data integer
        ArrayDeque<Integer> arraydeque = new ArrayDeque<>();
        
        //Menambahkan bebeberapa elemen ke ArrayDeque
        arraydeque.add(3);
        arraydeque.add(2);
        arraydeque.add(1);
        
        // Menampilkan elemen ArrayDeque menggunakan iterator
        for (int num : arraydeque){
            System.out.println(num);
        }
    }
}