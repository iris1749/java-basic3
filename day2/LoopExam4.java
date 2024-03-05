package day2;

public class LoopExam4 {
    public static void main(String[] args) {
        // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        // 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
        // ex )
        // 오름차순 :  1, 2, 3, 4, 5
        // 내림차순 :  5, 4, 3, 2, 1
        int a = 12;
        int b = 5;
        int min;
        int max;

        if (a < b) {
            min = a;
            max = b;
        }
        else {
            min = b;
            max = a;
        }
        /*
        비교 연산자를 이용한 방법으로도 if else 문을 대체 가능함.(chat gpt 사용)
        int min = a < b ? a : b;
        int max = a > b ? a : b;
        */
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }

    }
}
