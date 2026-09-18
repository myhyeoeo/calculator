package calculator1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //➕ ➖ ✖ ➗
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        char op = ' ';
        int result = 0;
        String repeat = "";

        while(!repeat.equals("exit")){

            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            b = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");
            op = sc.nextLine().charAt(0);

            if(a<0 || b<0){
                System.out.println("첫 번째 숫자와 두 번째 숫자는 양의 정수여야 합니다");
            }
            else if(op!='+' && op!='-' && op!='*' && op!='/'){
                System.out.println("사칙연산 기호는 +,-,*,/ 중에 입력해야 합니다");
            }
            else{
                if(op=='+'){
                    result = a+b;
                }
                else if (op=='-') {
                    result = a-b;
                }
                else if (op=='*'){
                    result = a*b;
                }
                else if(op=='/'){
                    if(b==0) System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                    else result = a/b;
                }
                System.out.println("결과: "+result);
            }
            System.out.print("더 계산하시겠습니까?(exit 입력 시 종료): ");
            repeat = sc.nextLine();
            if(repeat.equals("exit")){
                System.out.println("프로그램을 종료합니다");
            }
        }


    }
}
