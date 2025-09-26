package quiz14;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /*
        업다운 게임
        1~100까지 랜덤한 정답을 만들고, 사용자에게 정답을 맞출 때까지 입력받는 프로그램입니다
        한글을 입력하더라도 정상적으로 돌아갈 수 있도록 예외처리 진행합니다.
        한글을 입력하면 무한루프를 돌게 되는데 그 해결방법을 찾아보세요
        */
        int correct_answer=(int)(Math.random()*100);
        System.out.println(correct_answer);
        Scanner scan = new Scanner(System.in);
        int count=0;

        while(true) {
            try {
                int answer = scan.nextInt();
                if (answer < correct_answer) {
                    System.out.println("더 큰 값을 입력하세요");
                    count++;
                } else if (answer > correct_answer) {
                    System.out.println("더 작은 값을 입력하세요");
                    count++;
                } else {
                    System.out.println("정답입니다");
                    System.out.println("시도횟수:" + count);
                    break;
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력값입니다. 1~100 사이의 숫자를 입력하세요");
                scan.nextLine();
            }


        }
    }
}
