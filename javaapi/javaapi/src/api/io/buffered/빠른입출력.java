package api.io.buffered;

import java.io.*;

public class 빠른입출력 {
    public static void main(String[] args) {
        //입출력
        try{
            //빠른 입력
            Reader rd=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(rd);
            System.out.println("입력하세요");
            String str=br.readLine(); //입력받은 데이터 읽기
            //빠른 출력
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(str);
            bw.flush();
            System.out.println(str);
        } catch (Exception e) {

        }
    }
}
