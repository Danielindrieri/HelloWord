import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yang = 3;
        int ying = 4;
            System.out.println(yang * ying);

        int a = 20;
        String c = "venti";
            System.out.println(a + c);

        String[] array = {"D", "A", "I", "E", "L"};
        String newString = "N";
        String[] array1 = inserisciStringa(array, newString);
        System.out.println("Nuovo array: " + Arrays.toString(array1));


          Scanner scanner =new Scanner(System.in);
          System.out.println("inserisci1");
          String string1 =scanner.nextLine();

        System.out.println("inserisci2");
        String string2 =scanner.nextLine();

        System.out.println("inserisci3");
        String string3 =scanner.nextLine();

        String unione =string1 + string2 + string3;

        String inverso = string3 + string2 + string1;

        System.out.println("concatenazione ordinata" + unione);
        System.out.println("concatenazione inversa" + inverso );

        scanner.close();

    }
    public static String[] inserisciStringa(String[] array, String newString) {
        String[] array1 = new String[6];
        array1[0] = array[0];
        array1[1] = array[1];
        array1[2] = newString;
        array1[3] = array[2];
        array1[4] = array[3];
        array1[5] = array[4];
        return array1;
    }
}

