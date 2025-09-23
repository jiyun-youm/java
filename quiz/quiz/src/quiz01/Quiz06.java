package quiz01;

public class Quiz06 {
    public static void main(String[] args) {
        dan(3);
        isEven(4);
        circleArea(3);
        countDiv(12);
        abs(-5);

    }
    //문제 1: 구구단 출력( 레벨 1 )
    static void dan(int a){
        for(int i=1;i<=9;i++){
            System.out.println(a+"x"+i+"="+(a*i));
        }
    }

    //문제 2: 짝수 판별( 레벨 2 )
    static boolean isEven(int num){
        return num%2==0;
    }

    //문제 3: 원의 넓이 (레벨 2 )
    static double circleArea(int c) {
        return 3.14159 * c * c;
    }

    //문제 4: 약수 개수 ( 레벨 3 )
    static int countDiv( int d) {
        int cnt=0;
        for(int i=1;i<=d;i++){
            if(d%i==0){
                cnt++;
            }
        }
        return cnt;
    }

    //문제 5: 절대값 변환 (레벨 3 )
    static int abs(int e){
        if(e<=0){
            return -e;
        } else {
            return e;
        }
    }
}
