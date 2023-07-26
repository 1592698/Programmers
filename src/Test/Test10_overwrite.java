package Test;
/*
* 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
* 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
* 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
* 예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 해당하는 부분은 "11oWor1"이고
* 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.*/

public class Test10_overwrite {
    public static String main(String[] args, String my_string, String overwrite_string, int s)
    {
                String answer = my_string.substring(0, s)
                        + overwrite_string + my_string.substring(s+overwrite_string.length());

                return answer;
            }
        }



