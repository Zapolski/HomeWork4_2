import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту параллелограмма: ");
        int n = Integer.parseInt(sc.nextLine());

        //заполненный
        for (int i = 1; i <= n; i++) {
            //печатаем пробелы
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //печатаем звездочки
            for (int j = 1; j <= n*3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //пустой
        for (int i = 1; i <= n; i++) {
            //печатаем пробелы
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //печатаем звездочки
            for (int j = 1; j <= n*3; j++) {
                if ((j==1)||(j==n*3)||(i==1)||(i==n)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
