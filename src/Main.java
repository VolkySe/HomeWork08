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
        for (int i = 0; i < arrFirst.length; i++) {
            if (i != arrFirst.length - 1) {
                System.out.print(arrFirst[i] + ", ");
            } else {
                System.out.println(arrFirst[i]);
            }
        }
        for (int i = 0; i < arrSecond.length; i++) {
            if (i != arrSecond.length - 1) {
                System.out.print(arrSecond[i] + ", ");
            } else {
                System.out.println(arrSecond[i]);
            }
        }
        for (int i = 0; i < arrThird.length; i++) {
            if (i != arrThird.length - 1) {
                System.out.print(arrThird[i] + ", ");
            } else {
                System.out.println(arrThird[i]);
            }
        }
        System.out.println();
        System.out.printf("Задача 3 %n");
        for (int i = arrFirst.length - 1; i >=0; i--) {
            if (i != 0) {
                System.out.print(arrFirst[i] + ", ");
            } else {
                System.out.println(arrFirst[i]);
            }
        }
        for (int i = arrSecond.length - 1; i >=0; i--) {
            if (i != 0) {
                System.out.print(arrSecond[i] + ", ");
            } else {
                System.out.println(arrSecond[i]);
            }
        }for (int i = arrThird.length - 1; i >=0; i--) {
            if (i != 0) {
                System.out.print(arrThird[i] + ", ");
            } else {
                System.out.println(arrThird[i]);
            }
        }

        System.out.println();
        System.out.printf("Задача 4 %n");
        for (int i = 0; i < arrFirst.length; i++) {
            if (arrFirst[i] % 2 != 0) {
                arrFirst[i] += 1;
            }
        }
        for (int i = 0; i < arrFirst.length; i++) {
            if (i != arrFirst.length - 1) {
                System.out.print(arrFirst[i] + ", ");
            } else {
                System.out.println(arrFirst[i]);
            }
        }
    }
}