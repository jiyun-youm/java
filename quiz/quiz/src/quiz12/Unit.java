package quiz12;

public abstract class Unit {
    private int x;
    private int y;
    private int hp;

    public static int attack=6;
    public static int armor=6;

    //생성자
    public Unit(int x, int y, int hp) {
        super();
    }

    public abstract void location();
    public abstract void stop();
    public abstract void move ();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
