package day07.modi.construct.pac1;

public class B {
    //멤버변수
    A a = new A(1); //public (0)
    A a2= new A(true); //default (0)
    //A a3= new A ("홍길동"); //private(X) //클래스가 달라서 안됨

    /// ///////////////////////////////////////
    B() {
        //객체
        a.a=1;
        a.b=2;
        //a.c=3; //private(x) //클래스가 다름

        a.method01();
        a.method02();
        //a.method03(); //private(x) //클래스가 다름
    }
}
