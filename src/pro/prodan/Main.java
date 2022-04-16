package pro.prodan;

public class Main {

    public static void main(String[] args) {
        // задача 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        int n = 10;
        for (; n >= 1; n--) {
            System.out.print(n + " ");
        }
        // задача 2
        System.out.print("\n");
        // 6-е число 1-я пятница мая 2022
        for (int friday = 6; friday <= 31; friday = friday + 7) {
            System.out.println("Today if Friday " + friday + "th" + " you have to make a report");
        }

        // задача 3
        int year = 2021;
        int startYear = year - 200;
        int endYear = year + 100;
        for (int c = 0; c <= endYear; c = c + 79)
            if (c >= startYear && c <= endYear) {
                System.out.println(c);
            }
    }
}