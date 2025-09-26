package quiz12;

public class MainClass {
    public static void main(String[] args) {
        Marine m1= new Marine(0,0);
        m1.location();
        m1.stop();
        m1.move();
        System.out.println("공격력"+Marine.attack+",방어력"+Marine.armor);
    }

}
