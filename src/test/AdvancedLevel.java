package test;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("AdvancedLevel 런");
    }

    @Override
    public void jump() {
        System.out.println("AdvancedLevel 점프");
    }

    @Override
    public void turn() {
        System.out.println("AdvancedLevel 턴");
    }
}
