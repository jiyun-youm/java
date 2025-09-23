package day01;

public class DataTypeEx {
    public static void main(String[] args) {
        //byte b=128; //안됨, -128부터 127까지만 저장가능
        byte b2=-128;

        short s=32767; // -32768~32767

        int i=2147483647; //21억까지 (기본 타입)

        long l=9223372036854775807L;  //맨 뒤에 L을 붙여서 긴 숫자임을 나타냄

        //2진수 8진수 16진수 형태도 저잗이 됩니다
        //2진수-앞에 0b붙임
        //8진수-앞에 0붙임
        //16진수-앞에 0x붙임
        int i2=01010; //9
        System.out.println("-----------------------");

        float f=3.142344534345252234243F; //뒤에 f를 붙임/ 7자리 넘게 저장해도 7자리까지만 출력됨
        double d=3.142342342423425;
        System.out.println(f);
        System.out.println(d);

        System.out.println("------------------------------");
        boolean b=true; //false;

    }
}
