package api.io.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

import static java.lang.System.out;

public class OutStreamEx {
    public static void main(String[] args) {
        OutputStream  out=null;
        try{
            out=new FileOutputStream("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt");
            String str="hello world";
            out.write(str.getBytes()); //파일을 써내림(byte기반으로)
        } catch (Exception e) {

        } finally {
            try{
                out.close();
            } catch (Exception e) {

            }

        }

    }
}
