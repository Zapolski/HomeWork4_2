import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int n = Integer.parseInt(sc.nextLine());

        int count = 0;
        int sum = 0;
        while (n!=0){
            count++;
            sum += n%10;
            n /= 10;
        }
        System.out.println("Количество разрядов: "+count);
        System.out.println("Сумма цифр числа: "+Math.abs(sum));
    }

}
