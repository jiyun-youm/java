package day07.encap.good;

public class MainClass {
    public static void main(String[] args) {

        MyDate myDate = new MyDate();
        myDate.setYear(2025);  //setter
        int year = myDate.getYear(); //getter
        System.out.println("당신의 생일은"+ year);

        myDate.setDay(12);
        myDate.setMonth(1);

        System.out.println(myDate.getDay());
        System.out.println(myDate.getMonth());
    }
}
