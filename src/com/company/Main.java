package com.company;

public class Main {

    public static void main(String[] args) {

        Task1(5, 2);

        Task2(1);

        Task3(1, 1, 1, 2, 2, 2);

        Task4(1000, 1100);

        Task5(10, 3, 2);

        Task6(1, 5);

        Task7(5, 3, 6, 5);

        Task8(1, 10, 10);

        Task9("1 2 3 4 5"," ");

        Task10("1 5 1 5 1", " ");

        Task11("4 5 3 4 2 3", " ");
    }

    public static void Task1(int a, int b) {
        a = a + b - (b = a);
        System.out.println("Task 1: \na = " + a + ";" + "  b = " + b);
    }

    private static void Task2(int lessonNumber) {

        int startFirstLesson = 9;

        int addedMinutesFromLessons = lessonNumber * 45;

        int addedMinutesFromBreak = (lessonNumber - 1) * 10;

        addedMinutesFromBreak -= ((lessonNumber - 1) % 2) * 5;

        int TimeSpand = addedMinutesFromBreak + addedMinutesFromLessons;

        int hours = 9 + (TimeSpand / 60);
        int minutes = TimeSpand % 60;

        System.out.println("\nTask 2:\nEnd of the " + lessonNumber + " lesson: " + hours + ":" + minutes);

    }

    public static void Task3(int hours1, int minutes1, int seconds1, int hours2, int minutes2, int seconds2) {
        int value1 = (hours1 * 60 + minutes1) * 60 + seconds1;
        int value2 = (hours2 * 60 + minutes2) * 60 + seconds2;
        int result = value2 - value1;
        System.out.println("\nTask 3: \nTime difference: " + result);

    }

    public static void Task4(int n, int m) {
        int result = (int) Math.ceil((double) m / n);

        System.out.println("\nTask 4: \nA car will drive " + m + " km for " + result + " days.");
    }

    public static void Task5(int h, int a, int b) {
        int result = (int) Math.ceil(((double) (h - a) / (a - b)) + 1);
        System.out.println("\nTask 5: \nSnail will crawl on day " + result);
    }

    public static void Task6(int a, int b) {
        int c = (a + b + Math.abs((a - b))) / 2;
        System.out.print("\nTask 6: \nThe max value: " + c + "\n");
    }




    public static void Task7(int rookCoordinate1, int rookCoordinate2, int figureCoordinate1, int figureCoordinate2) {
        if (rookCoordinate1 % 2 == figureCoordinate1 % 2 || rookCoordinate2 % 2 == figureCoordinate2 % 2) {
            System.out.println("\nTask 7:\nYes");
        } else {
            System.out.println("\nTask 7:\nNo");
        }
    }

    public static void Task8(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("\nTask 8:\n" + 3);
        } else if (a == b || a == c || b == c) {
            System.out.println("\nTask 8:\n" + 2);
        } else
            System.out.println("\nTask 8:\n" + 0);
    }

    public static void Task9(String str, String separator) {

        String[] strMas = str.split(separator);

        int[] numbers = new int[strMas.length];

        for (int i = 0; i < strMas.length; i++) numbers[i] = Integer.parseInt(strMas[i]);

        int value = 0;

        for (int i = 0; i < numbers.length; i++){
            if(i + 1 == numbers.length) break;
            if(numbers[i] < numbers[i + 1]){
                value++;
            }
        }
        System.out.println("\nTask 9:\n" + value);

    }

    public static void Task10(String str, String separator) {

        String[] strMas = str.split(separator);

        int[] numbers = new int[strMas.length];

        for (int i = 0; i < strMas.length; i++) numbers[i] = Integer.parseInt(strMas[i]);

        int value = 0;

        for (int i = 0; i < numbers.length; i++){
            if(i + 1 == numbers.length || i - 1 == numbers.length) break;
            if(numbers[i] > numbers[i + 1] && numbers[i] > numbers[i - 1] ){
                value++;
            }
        }
        System.out.println("\nTask 10:\n" + value);
    }

    public static void Task11(String str, String separator) {

        String[] strMas = str.split(separator);

        int[] numbers = new int[strMas.length];

        for (int i = 0; i < strMas.length; i++) numbers[i] = Integer.parseInt(strMas[i]);

        for (int i = 0; i < numbers.length; i+=2){
            if(i + 1 == numbers.length)  break;

            numbers[i] = numbers[i] + numbers[i + 1] - (numbers[i + 1] = numbers[i]);

        }

        System.out.println("\nTask 11: ");

        for (int i = 0; i < strMas.length; i++){
                System.out.print(" " +  numbers[i] + " ");

        }
    }

}






