package day09.exception.throw_;

public class ThrowEx01 {
    public static void main(String[] args) {
        try{
            calc(-10);
        } catch(Exception e){
            System.out.println("예외 발생");
            e.printStackTrace();
        }

    }
    public static int calc(int a) throws Exception{
        if(a<0){
            System.out.println("0보다 큰 값을 전달하세요");
            throw new Exception(); //예외를 직접 만듦-try catch 문장이나 throws구문으로 반드시 예외를 처리해야 합니다
        }

        int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        return a;
    }
}
