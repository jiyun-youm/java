package day01;

public class DataTypeStringEX {
    public static void main(String[] args) {
        //단일문자를 저장하는 char
        char c1='a';
        char c2=65;  //아스키 코드: 1byte, 영어만 가능
        System.out.println(c1);
        System.out.println(c2);

        //유니코드: 2byte, 전세계문자를 저장
        char c3='가';
        char c4=44032;
        char c5='\uAC00';
        System.out.println(c3);
        System.out.println(c3+"-"+c4);

        //문자열
        String s1="오늘 점심은";
        String s2="뭐 먹을까";
        //문자열을 더하면 문자열을 붙인 결과를 가져옵니다
        System.out.println(s1+s2);
        //문자열에 다른 타입을 더하면, 항상 문자열이 됩니다
        System.out.println(200+200); //400
        System.out.println("200"+200); //200200
        System.out.println(200+200+"200"); //400200
    }
}
