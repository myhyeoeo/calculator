package calculator1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        char op = ' ';

        System.out.print("첫 번째 숫자를 입력하세요: ");
        a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        b = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        op = sc.nextLine().charAt(0);

    }
}
