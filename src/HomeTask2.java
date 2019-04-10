public class HomeTask2 {
    public static void main(String[] args) {
        double sum = 0;
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 7};
        for (int el : array1) {
            sum = sum + el;
        }
        double avg = sum / array1.length;
        System.out.println("Среднее арифметическое всех значений массива: " + avg);
        System.out.println(sum + ", " + array1.length);


        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int[] el : array2) {
            for (int i : el) {
                count++;
            }
        }
        System.out.println("Количество элементов в массиве: " + count);

        String[][] array3 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int qnt = 0;
        for (String[] str : array3) {
            for (String word : str) {
                if (!word.contains("е")) { // кириллическая е
                    qnt++;
                }
               /* if (!word.matches(".+е.+")) { // кириллическая е
                    qnt++;
                }*/
                /*if (word.indexOf('е') == -1) { // кириллическая е
                    qnt++;
                }*/
            }
        }
        System.out.println("Количество строк в массиве без буквы е: " + qnt);
    }
}