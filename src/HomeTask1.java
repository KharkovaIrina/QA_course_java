public class HomeTask1 {
    public static void main(String[] args) {
        // Задание 1:
        // c if-ом
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        // без if-а
        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }

        // Задание 2:
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\u043E') {
                System.out.println(s.charAt(i));
            }
        }
        // Задание 3:
        String str = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\u0435') {
                count++;
            }
        }
        System.out.println(count);
    }
}
