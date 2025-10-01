package api.annonymous.basic;

public class MainClass {
    public static void main(String[] args) {
        //Car car=new Tico();
        //car.run();
        //Car인터페이스를 구현하는 클래스가 매번 달라진다면 익명 객체를 사용할 수 있음
        new Car(){
            public void run() {
                System.out.println("Tico");
            }
        };

    }
}
