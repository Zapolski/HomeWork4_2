import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int n = Integer.parseInt(sc.nextLine());

        //заполненный
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //пустой
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j < n; j++) {
                if ((j==n-i)||(j==n-1)||(i==n)) System.out.print("*");
                else  System.out.print(" ");
            }
            System.out.println();
        }
    }
}
