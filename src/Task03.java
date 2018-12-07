import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int n = Integer.parseInt(sc.nextLine());

        //заполненный
        for (int i = 1; i <= n; i++) {
            //печатаем пробелы
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //печатаем звездочки
            for (int j = 1; j <= i+(i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //пустой
        for (int i = 1; i <= n; i++) {
            //печатаем пробелы
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //печатаем звездочки
            for (int j = 1; j <= i+(i-1); j++) {
                if ((j==1)||(i==n)||(j==i+(i-1)))System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
