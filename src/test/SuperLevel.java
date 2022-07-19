package test;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("SuperLevel 런");
    }

    @Override
    public void jump() {
        System.out.println("SuperLevel 점프");
    }

    @Override
    public void turn() {
        System.out.println("SuperLevel 턴");
    }
}
