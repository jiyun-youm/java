package day01;

public class VariableEx {
    public static void main(String[] args) {
        //변수의 선언
        int num;
        //변수의 초기화
        num=20;
        System.out.println(num);

        //선언과 초기화
        int num2=20;

        //다른값을 저장할 수 있음
        int result=num+num2;
        System.out.println(result);

        //문자열을 저장하는 변수
        String name="홍길동";

        //변수의 범위
        int a=10;
        if(true){
            int b=20;
            System.out.println(a);
            System.out.println(b);
        }
        //System.out.println(b);  //if문 안에서 만들어진 b는 if문 밖에서는 쓸 수 없음
    }
}


