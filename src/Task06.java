import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество ступенек: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            //отступы перед горизонтальной палочкой
            for (int j = 0; j < i; j++) System.out.print("  ");
            //горизонтальная палочка
            System.out.println("***");

            if (i+1!=n){
                //отступы перед вертикальной палочкой
                for (int j = 0; j < i+1; j++) System.out.print("  ");
                //вертикальная палочка
                System.out.println("*");
            }
        }
    }
}
