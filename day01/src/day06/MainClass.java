package day06;

import day06.fruit.*;
import day06.toy.Car;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Apple apple=new Apple();
        Car car=new Car();
        Melon melon= new Melon();

        Scanner scan=new Scanner(System.in);  //import java.util.Scanner; 이 안에 있는 클래스임

        int a=1;

        System.out.println(a); //값 자체를 출력
        System.out.println(apple);  //주소값
        System.out.println(scan);  //주소값

        int[] arr= new int[3];
        System.out.println(arr);  //주소값 //arr도 참조타입
    }
}
