package test;

public class BasicLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("BasicLevel 런");
    }

    @Override
    public void jump() {
        System.out.println("BasicLevel 점프");
    }

    @Override
    public void turn() {
        System.out.println("BasicLevel 턴");
    }
}
