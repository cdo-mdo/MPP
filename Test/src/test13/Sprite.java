package test13;

public interface Sprite {
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
    default void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }
}
