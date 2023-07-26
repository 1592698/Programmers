package Test;

import java.util.Scanner;

/*영어 알파벳으로 이루어진 문자열 str이 주어집니다.
각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.*/
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] array = a.toCharArray();

        for (int i = 0; i < a.length(); ++i) {
            if ((int)array[i] >= 97) {
                array[i] -= 32;
            }
            else {
                array[i] += 32;
            }
        }
        String new_a = new String(array);
        System.out.println(new_a);
    }
}
