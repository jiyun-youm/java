package day07.poly.basic3;

//사람이 가져야 하는 부모클래스 공통내용
public class Person {
    String name;
    int age;
    String info() {
        return "이름: "+ name + ", 나이: "+age;
    }
}
