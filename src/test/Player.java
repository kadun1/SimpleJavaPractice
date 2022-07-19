package test;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BasicLevel();
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int i) {
        level.go(i);
    }
}
