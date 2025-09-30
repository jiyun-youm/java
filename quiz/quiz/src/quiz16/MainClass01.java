package quiz16;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {
    public static void main(String[] args) {
        //1.리스트에 1~10까지 정수를 반복문으로 저장
        //2. 저장한 값을 반복문으로 출력
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<21;i++){
            list.add(i);
        }
        for(int j=0;j<20;j++){
            System.out.println(list.get(j));
        }
    }
}
