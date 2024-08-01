import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Задача 1 %n"); //или System.out.println("Задача 1 ");
        int[] arrFirst = new int[3];
        for (int i = 0; i < 3; i++) {
            arrFirst[i] = i + 1;
        }
        float[] arrSecond = {1.57f, 7.654f, 9.986f};
        boolean[] arrThird = {true, true, false};

        System.out.println("Все массивы созданы и проинициализированы");
        System.out.println();

        System.out.printf("Задача 2 %n");
        System.out.println(Arrays.toString(arrFirst));
        System.out.println(Arrays.toString(arrSecond));
        System.out.println(Arrays.toString(arrThird));

        System.out.println();
        System.out.printf("Задача 3 %n");
        int counter;
        for (counter = arrFirst.length - 1; counter >= 1; counter--) {
            System.out.print(arrFirst[counter] + ", ");
        }
        System.out.println(arrFirst[counter]);
        for (counter = arrSecond.length - 1; counter >= 1; counter--) {
            System.out.print(arrSecond[counter] + ", ");
        }
        System.out.println(arrSecond[counter]);
        for (counter = arrThird.length - 1; counter >= 1; counter--) {
            System.out.print(arrThird[counter] + ", ");
        }
        System.out.println(arrThird[counter]);

        System.out.println();
        System.out.printf("Задача 4 %n");
        for (int i = 0; i < arrFirst.length; i++) {
            if (arrFirst[i] % 2 != 0) {
                arrFirst[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrFirst));
    }
}