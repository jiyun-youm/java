package day09.inter.basic2;

public class MainClass {
    public static void main(String[] args) {
        Animal baduk=new Dog();
        Animal nabi=new Cat();
        Animal hodl=new Tiger();

        //dog는 animal 처럼 사용이 됩니다
        Animal []arr={baduk,nabi,hodl};
        for(Animal ani :arr){
            ani.eat();
        }

        System.out.println("-------------------------");
        //펫 배열
        //dog는 animal타입이지만, 하위클래스가 상위클래스와 연관이 있으면, 상호 변환이 됩니다.
        IPet[] pets = new IPet[3];
        pets[0]=(IPet)baduk;
        pets[1]=(IPet)nabi;
        pets[2]=new GoldFish();

        for(IPet p : pets){
            p.play();
        }
    }
}
