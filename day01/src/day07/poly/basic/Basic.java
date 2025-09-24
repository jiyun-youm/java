package day07.poly.basic;

//하나의 자바파일에 여러 클래스를 선언할 수 있습니다
//단 public class는 하나여야 하며, 파일명과 동일한 클래스여야 함.
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
    //다형성: 자식 객체가 부모타입에 저장될 수 있는 특징
    A a=new A();
    A b=new B();
    A c=new C();
    A d=new D();
    A e=new E();

    //다형성은 상속을 전제로 합니다
    //B bb= new E(); 안됨

    //Object에는 모든 클래스 타입이 저장될 수 있음
    Object o1=1;
    Object o2="3";
    Object o3=new A();


}
