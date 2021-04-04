package backjoon04;

public class BackJoon02 {

    public static void main(String[] args) {

        for (int i = 1 ; i < 10001 ; i ++) {
            int res = d(i);
        }

        System.out.println(1234 + (1234 % 10));
    }
    // 함수 정의
    public static int d (int number) {
        int sum = number;

        // 셀프넘버를 찾기 위한 반복문 시작
        // 1. 자리수를 더해주기 위해 나머지 연산자와 나눗셈 연산자로
        // 10 단위씩 number을 줄여 갈 것 이기 때문에 number가 0이 아닐 때 까지 반복
        while (number != 0){
            sum = sum + (number % 10); // 첫 째 자리수 구하기
            number = number/ 10;       // 10을 나누어 첫 째 자리를 없앤다
        }

        return sum;


    }
}