package quiz16;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        User user1=new User("가",1);
        User user2=new User("나",2);
        list.add(user1);
        list.add(user2);

//        for(int i=0;i<list.size();i++){
//            User u=list.get(i);
//            int age=u.getAge();
//            String name=u.getName();
//            System.out.println(age+" "+name);
//        }

        for(User user:list){
            System.out.println(user.getAge()+" "+user.getName());
        }


        //홍길동이면 삭제
        for(int i=0; i<list.size();i++){
            User u=list.get(i);

            if(u.getName().equals("홍길동")){
                list.remove(i);
            }
        }
    }
}
