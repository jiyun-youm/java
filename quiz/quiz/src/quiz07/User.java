package quiz07;

public class User {
    private String name;
    private String rrn;
    private int age;

    Public User(){
        this.name="Unknown";
        this.rrn="Unknown";
        this.age=0;
    }
    Public User(String name, String rrn, int age) {
        this.name= name;
        this.rrn=rrn;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //기본 생성자로 만들어서..setter로 값 지정
    //생성자
}
