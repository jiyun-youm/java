package api.io.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx {
    public static void main(String[] args) {
        //1바이트 기반이기 때문에 텍스트 데이터를 읽거나 쓰는데는 한계점이 있음
        //1바이트 기반이라서
        //파일데이터를 읽고 쓸 때 사용함
        try{
            InputStream in=new FileInputStream("C:\\Users\\user\\Desktop\\course\\upload\\hello");

            while(true){
                int a =in.read();
                if(a==-1){
                    break;
                }
                System.out.print((char)a);
            }
            in.close();
        } catch (Exception e) {

        }
    }
}
