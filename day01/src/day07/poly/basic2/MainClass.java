package day07.poly.basic2;

public class MainClass {
    public static void main(String[] args) {
        Child c=new Child();
        c.method01();  //상속받은거
        c.method02();  //오버라이딩
        c.method03();  //내꺼

        //다형성 적용
        Parent p=c;

        //parent에 있는 기능만 사용 가능, //오버라이딩 되어있으면 오버라이드된 메서드가 실행됨
        p.method01();
        p.method02();  //오버라이딩됨

        //다형성이 적용되면, 원래 멤버에 접근할 수 없어지는 문제
        //그래서 클래스를 다시 형변환할 수 있습니다
        System.out.println("==================================");
        Child cc=(Child)p;
        cc.method01();
        cc.method02();
        cc.method03();

        //주의할 점- 본래 자식으로 만들어진 객체만, 다시 자식클래스로 변환할 수 있다
        //예외
        //Parent pp= new Parnet();
        //Child ccc=(Child)pp;

    }
}
