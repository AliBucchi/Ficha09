import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Exercicio01 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(); //ordena a entrada em ordem crescente e elimina repetições

        set.add(5);
        set.add(3);
        set.add(8);
        set.add(3);

        for (Integer i: set) {
            System.out.print("A ordem do Set: ");
            System.out.println(i);
        }

        LinkedHashSet<Integer> linkedeset = new LinkedHashSet<>(); //não ordena a entrada e elimina repetições

        linkedeset.add(5);
        linkedeset.add(3);
        linkedeset.add(8);
        linkedeset.add(3);

        for (Integer i: linkedeset) {
            System.out.print("A ordem do LinkedSet: ");
            System.out.println(i);
        }

        TreeSet<Integer> tree = new TreeSet<>(); //ordena a entrada em ordem crescente e elimina repetiçoes.

        tree.add(5);
        tree.add(3);
        tree.add(8);
        tree.add(3);

        for (Integer i: tree) {
            System.out.print("A ordem do TreeSet: ");
            System.out.println(i);
        }

    }
}

