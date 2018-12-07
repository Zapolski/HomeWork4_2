import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во звездочек в стороне ромба: ");
        int n = Integer.parseInt(sc.nextLine());

        int count =1;
        boolean flag = true;
        //заполненный
        for (int i = 1; i <= n*2-1; i++) {
            //печатаем пробелы
            for (int j = 1; j <= n - count; j++) {
                System.out.print(" ");
            }
            //печатаем звездочки
            for (int j = 1; j <= count + (count - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

            if (count==n) flag=false;
            if (flag)count++;else count--;
        }

        //пустой
        count =1;
        flag = true;
        //заполненный
        for (int i = 1; i <= n*2-1; i++) {
            //печатаем пробелы
            for (int j = 1; j <= n - count; j++) {
                System.out.print(" ");
            }
            //печатаем звездочки
            for (int j = 1; j <= count + (count - 1); j++) {
                if ((j==1)||(j==count + (count - 1))) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();

            if (count==n) flag=false;
            if (flag)count++;else count--;
        }
    }
}
