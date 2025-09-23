package day01;

public class OperationEx01 {
    public static void main(String[] args) {
        int i=1;
        System.out.println(-i); //-1 //부호 연산자

        //증감연산자
        int k=1;
        //int h=k++; //먼저 값을 대입하고 그다음에 증가
        int h=++k; //먼저 증가하고 그 다음에 대입
        System.out.println("k값: "+h+", h값:"+h);

        //비트연산자
        byte b=10;
        System.out.println(~b);
        System.out.println(~b+1); //더했을 때 0이되는 수가 나옴

        //논리반전연산자
        System.out.println(!true); //false

    }
}
