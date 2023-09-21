public class Main {
    public static void main(String[] args) {
        tasks();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void tasks() {
        System.out.println("Задача №1");
        int[] arr1 = generateRandomArray();
        int sum = 0;
        for (int e : arr1) {
            sum += e;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задача №2");
        int minimum = arr1[0];
        int maximum = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < minimum) {
                minimum = arr1[i];
            }
            if (arr1[i] > maximum) {
                maximum = arr1[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimum + " рублей. Максимальная сумма трат за день составила " + maximum + " рублей");
        System.out.println("Задача №3");
        double average = (double) (sum / arr1.length);
        System.out.println("Средняя сумма трат за месяц составила "+average+" рублей");
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }
    }
}


