package calculator2;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public int calc(int a, int b, char op){
        int result = 0;

        if(a<0 || b<0){
            System.out.println("첫 번째 숫자와 두 번째 숫자는 양의 정수여야 합니다");
            return 0;
        }

        if(op == '+'){
            result = a+b;
        }
        else if(op == '-'){
            result = a-b;
        }
        else if(op == '*'){
            result = a*b;
        }
        else if(op == '/'){
            if(b==0){
                System.out.println("분모는 0이 될 수 없습니다");
                return 0;
            }
            result = a/b;
        }
        else{
            System.out.println("잘못된 연산자입니다");
        }
        arrayList.add(result);
        return result;
    }


}
