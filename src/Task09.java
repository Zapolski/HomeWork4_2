import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество ярусов елочки: ");
        int n0 = Integer.parseInt(sc.nextLine());

        System.out.print("Введите высоту первого яруса елочки: ");
        int n1 = Integer.parseInt(sc.nextLine());

        for (int k = 0; k < n0; k++) {
            int n=n1+k;
            //заполненный
            for (int i = 1; i <= n; i++) {
                //печатаем пробелы
                for (int j = 1; j <=n-i+(n0-k-1) ; j++) {
                    System.out.print(" ");
                }
                //печатаем звездочки
                for (int j = 1; j <= i+(i-1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }



    }

}
