package day06.str_equals;  //패키지 선언, 이 클라스가 여기 있다고 알려줌 //이 클래스를 다른 데에서 쓸 때 사용함

public class StringEquals {
    public static void main(String[] args) {
        String str1="홍길동";
        String str2="홍길동";
        String str3=new String("홍길동");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //같은 클래스 내부에서 문자열을 그냥 선언하면, 동일한 문자열 객체를 재활용하게 됩니다.
        //같은 클래스 내부에서 직접 문자열 생성명령을 내리거나 다른 클래스에서 넘어온 문자열은 다른 주소값을 가지게 됩니다
        //문자열 동등비교 문자열.equals()로 해야합니다
        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false

        System.out.println(str1.equals(str3));  //true

    }
}
