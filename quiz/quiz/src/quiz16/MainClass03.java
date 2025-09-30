package quiz16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass03 {
    public static void main(String[] args) {

        //메뉴를 입력받고, 메뉴에 따라서 기능을 구현
        Scanner sc=new Scanner(System.in);
        List<User> list=new ArrayList<>();
        while(true){
            System.out.println("[1.회원추가, 2.회원찾기, 3.회원삭제]");
            int menu=sc.nextInt();
            if(menu==1){
                //이름과 나이를 입력받아서 리스트에 추가
                System.out.print("이름과 나이를 입력하세요");
                String name=sc.next();
                int age=sc.nextInt();
                User user=new User(name,age);
                list.add(user);



            } else if(menu==2){
                //이름을 입력받아서 이름이 있으면 정보를 출력, 없으면 "찾는 회원은 없습니다" 출력
                System.out.println("이름을 입력하세요");
                String name=sc.next();
                boolean flag=false;

                for(int i=0;i<list.size();i++){
                    User u=list.get(i);
                    if(u.getName().equals(name)){
                        System.out.println(list.get(i));
                        flag=true;
                        break;
                    }
                    if(flag==false){
                        System.out.println("찾는 회원은 없습니다");
                    }
                }

            } else if(menu==3){
                //삭제할 이름을 입력받아서, 있으면 삭제, 없으면 "삭제할 회원이 없습니다" 출력
                System.out.println("이름을 입력하세요");
                String name=sc.next();

                boolean flag=false;
                for(int i=0;i<list.size();i++){
                    User u=list.get(i);
                    if(u.getName().equals(name)){
                        list.remove(i);
                        flag=true;
                        break;
                    }
                    if(flag==false){
                        System.out.println("삭제할 회원이 없습니다");
                    }
                }

            }
        }
    }
}
