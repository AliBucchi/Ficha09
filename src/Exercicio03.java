import java.util.*;

public class Exercicio03 {

    public static void main(String[] args) {
        int i;
        long Duration_1;
        long Duration_2;
        long Duration_3;
        long Duration_4;
        long Duration_5;
        long Duration_6;
        long Duration_7;
        long Duration_8;
        long Start_time, End_time;

        Random random = new Random();

        HashMap<Integer,Integer> HMap = new HashMap<>();

        Start_time = System.nanoTime();

        for (i = 1; i <= 30000; i++) {
            HMap.put(i,random.nextInt(30000));
        }

        End_time = System.nanoTime();
        Duration_1 = (End_time - Start_time) / 1000000;


        Start_time = System.nanoTime();

        for (i = 1; i <= 30000; i++) {
            System.out.println(HMap.get(random.nextInt(30000)));
        }

        End_time = System.nanoTime();
        Duration_2 = (End_time - Start_time) / 1000000;


        System.out.println("O tempo HashMap em milisegundos de leitura foi: " + Duration_1);
        System.out.println("O tempo HashMap em milisegundos de pesquisa foi: " + Duration_2);

        /////////////////////////////////////////////////////////////////////////////////////////////////

        Hashtable<Integer,Integer> Htable = new Hashtable<>();

        Start_time = System.nanoTime();

        for (i = 1; i <= 30000; i++) {
            Htable.put(i,random.nextInt(30000));
        }

        End_time = System.nanoTime();
        Duration_3 = (End_time - Start_time) / 1000000;


        Start_time = System.nanoTime();

        for (i = 1; i <= 30000; i++) {
            System.out.println(Htable.get(random.nextInt(30000)));
        }

        End_time = System.nanoTime();
        Duration_4 = (End_time - Start_time) / 1000000;


        System.out.println("O tempo Hashtable em milisegundos de leitura foi: " + Duration_3);
        System.out.println("O tempo Hashtable em milisegundos de pesquisa foi: " + Duration_4);

        //////////////////////////////////////////////////////////////////////////////////////////////////

        LinkedHashMap<Integer,Integer> LHMap = new LinkedHashMap<>();

        Start_time = System.nanoTime();

        for (i = 1; i <= 30000; i++) {
            LHMap.put(i,random.nextInt(30000));
        }

        End_time = System.nanoTime();
        Duration_5 = (End_time - Start_time) / 1000000;


        Start_time = System.nanoTime();

        for (i = 1; i <= 30000; i++) {
            System.out.println(LHMap.get(random.nextInt(30000)));
        }

        End_time = System.nanoTime();
        Duration_6 = (End_time - Start_time) / 1000000;


        System.out.println("O tempo LinkedHashMap em milisegundos de leitura foi: " + Duration_5);
        System.out.println("O tempo LinkedHashMap em milisegundos de pesquisa foi: " + Duration_6);

        //////////////////////////////////////////////////////////////////////////////////////////////////


        TreeMap<Integer,Integer> TMap = new TreeMap<>();

        Start_time = System.nanoTime();

        for (i = 1; i <= 30000; i++) {
            TMap.put(i,random.nextInt(30000));
        }

        End_time = System.nanoTime();
        Duration_7 = (End_time - Start_time) / 1000000;


        Start_time = System.nanoTime();

        for (i = 1; i <= 30000; i++) {
            System.out.println(TMap.get(random.nextInt(30000)));
        }

        End_time = System.nanoTime();
        Duration_8 = (End_time - Start_time) / 1000000;


        System.out.println("O tempo TreeMap em milisegundos de leitura foi: " + Duration_7);
        System.out.println("O tempo TreeMap em milisegundos de pesquisa foi: " + Duration_8);
    }

}


