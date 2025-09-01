/*Demonstrate usage of generics with lists, like List<String> and List<Integer>.*/
//Name:Diya Manandhar
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Diya");
        names.add("Nischal");

        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
