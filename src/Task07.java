import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.print("Число в обратном порядке: ");
        while (n!=0){
            System.out.print(n%10);
            n /= 10;
        }
    }
}
