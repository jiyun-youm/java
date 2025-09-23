package day06.overriding.basic01;

public class MainClass {
    public static void main(String[] args) {
        Child child = new Child();
        child.method01();
        child.method02();  //오버라이딩 실행
    }
}
