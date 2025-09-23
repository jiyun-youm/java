package day01;

public class OperationEx02 {
    public static void main(String[] args) {
        int i=10/3;
        int j=10%3;

        //비교연산자
        System.out.println(i==j); //f
        System.out.println(i!=j); //t
        System.out.println(i>=j); //t
        System.out.println(i<=j);  //f

        //비트연산자
        int a=192;
        System.out.println(a<<3);
        System.out.println(a>>3);

        //대입연산자 +=,-=,/+
        int num=1;
        num+=3;
        num-=1;
        num*=2;
        num/=2;
        num%=3;
        System.out.println(num);

        //논리연산자
        // &,| 한개짜리는 무조건 뒤에 코드를 실행
        //&&, || 두 개짜리는 만족하지 않는 조건이라면 뒤에를 실행하지 않음
    }
}
