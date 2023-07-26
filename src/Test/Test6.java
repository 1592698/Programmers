package Test;

import java.util.Scanner;
//두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
//        a + b = c
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " + " + b +" = ");
        System.out.println(a + b);

    }
}
