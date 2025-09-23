package day06.this_;

//사람이 가져야 하는 부모클래스 공통내용
public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name=name;  //this.name은 위(필드)에 String name이고 오른쪽 name은 윗줄의 네임임
        this.age=age;
        //복잡한 계산식 100개
        System.out.println(this);  //내 위치를 나타내는 주소식
    }

    Person(String name) {
        this(name, 0);
    }

    Person( ){
        this("이름없음", 0);
    }

    String info() {
        return "이름: "+ name + ", 나이: "+age;
    }
}
