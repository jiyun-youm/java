package quiz20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class MainClass {
    public static void main(String[] args) {
         try{
             Reader in=new FileReader("C:\\Users\\user\\Desktop\\course\\upload\\2025_10_01_data.csv");
             BufferedReader br=new BufferedReader(in);
             String str="";
             while((str=br.readLine())!=null){
                 System.out.println(str);
             }





         } catch(Exception e){

         }
    }
}
