package calculator2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.nextLine().charAt(0);

            calculator.calc(a,b,op);
            System.out.print("더 계산하시겠습니까?(exit 입력시 종료):");
            String answer = sc.nextLine();
            if(answer.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }
    }
}
