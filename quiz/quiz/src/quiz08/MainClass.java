package quiz08;

public class MainClass extends Person {
    public static void main(String[] args) {
        Phone phone = new Phone("1234","아이폰");
        Person person = new Person("홍길동",phone);
        person.getPersonInfo();
    }
}
