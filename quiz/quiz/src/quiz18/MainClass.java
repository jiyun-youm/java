package quiz18;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        //1.random클래스를 활용해서 1~45까지의 랜덤한 번호를 생성
        //2.set을 이용해서 6개의 고유한 로또번호를 만들어내는 프로그램 코드를 작성해보세요

        Set<Integer> set= new HashSet<Integer>();
        for(int i=1; set.size()<=6;i++) {
            set.add((int) (Math.random() * 45+1));
        }
        System.out.println(set);
    }
}
