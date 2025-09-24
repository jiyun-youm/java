package day07.poly.basic3;

public class MainClass {
    public static void main(String[] args) {
        //배열에서 다형성
        //하나의 부모타입으로 모든 자식을 담을 수 있음

        Student s1=new Student("홍길동",20,"123");
        Student s2=new Student("이순신",10,"124");
        Student s3=new Student("홍길자",30,"125");

        Teacher t1=new Teacher("영자",30,"수학");
        Teacher t2=new Teacher("영수",30,"과학");

        Employee e1= new Employee("철수",50,"회계");

        //다형성-각각 student, teacher, employee이지만 부모인 person에 저장
        Person[] arr={s1,s2,t1,t2,e1};

        for(Person p:arr){
            System.out.println(p.info());
        }
        System.out.println("=======================");
        //매개변수에 적용될 수 있는 다형성
        House house = new House();
        house.personInfo(s1);
        house.personInfo(s2);
        house.personInfo(t1);
        house.personInfo(t2);
        house.personInfo(e1);

        house.personsInfo(arr);//펄슨 배열
    }
}
