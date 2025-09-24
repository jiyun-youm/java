package day07.encap.obj;

public class Hotel {
    //클래스타입
    private Chef chef;

    //chef를 초기화 하는 생성자
    public Hotel(Chef chef) {
        this.chef = chef;
        //chef = new Chef();

        //매개변수로 객체를 받는 setter
        public void setChef(Chef chef){
            this.chef = chef;
        }

        //객체를 조회하는 getter
        public Chef getChef(){
            return chef;
        }
    }
}
