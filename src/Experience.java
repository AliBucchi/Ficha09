import java.util.*;

public class Experience {

    public static void main(String[] args) {
        int n, registros;
        double Start_time, End_time;
        double Duration_1;

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o numero de valores a serem inseridos na lista: ");
        n = ler.nextInt();

        TreeSet<Integer> tree = new TreeSet<>();

        Start_time = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o(s) numeros(s): ");
            registros = ler.nextInt();

            tree.add(registros);
        }

        for (Integer i: tree) {
            System.out.print("A ordenação: ");
            System.out.println(i);
        }

        End_time = System.nanoTime();

        Duration_1 = (End_time - Start_time) / 1000000;

        System.out.println("O tempo de execução de leitura foi: " + Duration_1 + " ms");

    }
}
