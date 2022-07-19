package test;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();

    final public void go(int len) {
        run();
        for (int i = 0; i < len; i++) {
            jump();
        }
        turn();
    }

    public void showLevelMessage() {
        System.out.println("레벨");
    }
}
