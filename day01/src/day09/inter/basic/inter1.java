package day09.inter.basic;

//클래스가 아니라서 객체 생성 불가
public interface inter1 {
    //상수와 추상메서드를 가질 수 있습니다
    double PI=3.14;  //자동으로 상수가 되어서 초기값 지정 안하면 오류 뜸
    void method01(); //자동으로 추상메서드 취급되어서 {}이거 하면 안됨

}
