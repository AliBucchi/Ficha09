import java.util.ArrayList;
import java.util.LinkedList;

public class Exercicio02 {

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();

        List.add(5);
        List.add(3);
        List.add(8);
        List.add(3);

        for (Integer i : List) {
            System.out.print("A ordem do List: ");
            System.out.println(i);
        }

        LinkedList<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(5);
        linkedlist.add(3);
        linkedlist.add(8);
        linkedlist.add(3);

        for (Integer i : linkedlist) {
            System.out.print("A ordem do LinkedList: ");
            System.out.println(i);
        }
    }
}
