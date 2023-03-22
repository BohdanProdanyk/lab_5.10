public class five {
    public static void main(String[] args) {

        int a = 0;

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                int h1 = h / 10; // перша цифра години
                int h2 = h % 10; // друга цифра години
                int m1 = m / 10; // перша цифра хв
                int m2 = m % 10; // друга цифра хв

                if (h1 == m2 & h2 == m1) {
                    a++;
                }
            }
        }

        System.out.println("Кількість симетричних комбінацій: " + a);
    }
}