import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String[][] matrix= {
            {"  ***  ",
             " *   * ",
             "*     *",
             "*     *",
             "*     *",
             " *   * ",
             "  ***  "},

            {"   *   ",
             "  **   ",
             "   *   ",
             "   *   ",
             "   *   ",
             "   *   ",
             "  ***  "},

            {"  ***  ",
             " *   * ",
             " *  *  ",
             "   *   ",
             "  *    ",
             " *     ",
             " ***** "},

            {"  ***  ",
             " *   * ",
             "    *  ",
             "   *   ",
             "    *  ",
             " *   * ",
             "  ***  "},

            {"   *   ",
             "  **   ",
             " * *   ",
             "*  *   ",
             "****** ",
             "   *   ",
             "   *   "},

            {" ***** ",
             " *     ",
             " *     ",
             "  ***  ",
             "     * ",
             " *   * ",
             "  ***  "},

            {"  ***  ",
             " *   * ",
             " *     ",
             " ****  ",
             " *   * ",
             " *   * ",
             "  ***  "},

            {" ***** ",
             "     * ",
             "    *  ",
             "   *   ",
             "  *    ",
             " *     ",
             " *     "},

            {"  ***  ",
             " *   * ",
             " *   * ",
             "  ***  ",
             " *   * ",
             " *   * ",
             "  ***  "},

            {"  ***  ",
             " *   * ",
             " *   * ",
             "  **** ",
             "     * ",
             " *   * ",
             "  ***  "}

        };


        Scanner sc = new Scanner(System.in);
        System.out.print("Введите чило: ");
        int n = Integer.parseInt(sc.nextLine());

        int coutnDigit = String.valueOf(n).length();

        int[] digits = new int[coutnDigit];
        for (int i = 0; i < coutnDigit; i++) {
            digits[i]=n%10;
            n /=10;
        }

        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = digits.length-1; j >=0 ; j--) {
                sb.append(matrix[digits[j]][i]);
            }
            System.out.println(sb.toString());
        }


    }
}

