public class Main {
    public static void main(String[] args) {
        int rows = 10; // Количество строк в треугольнике

        for (int i = 1; i <= rows; i++) {
            // Печатаем пробелы перед цифрами 7
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Печатаем цифры 7
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("7");
            }

            System.out.println(); // Переходим на новую строку после печати строки
        }
    }
}