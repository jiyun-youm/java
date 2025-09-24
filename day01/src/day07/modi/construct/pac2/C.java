package day07.modi.construct.pac2;

import day07.modi.construct.pac1.A;

public class C {
    //멤버변수
    A a = new A(1); //public (0)
    //A a2= new A(true); //default (X) //패키지가 달라서 안됨
    //A a3= new A ("홍길동"); //private(X) //클래스,패키지가 달라서 안됨

    C() {
        //객체
        a.a=1;
        //a.b=2; //default(x) //패키지가 다름
        //a.c=3; //private(x) //클래스가 다름

        a.method01();
        //a.method02(); //defalut(x) //패키지가 다름
        //a.method03(); //private(x) //클래스가 다름
    }
}
