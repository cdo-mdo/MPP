package test14;

public class CPU {
    double speed;
    String maker;
    
    CPU (String maker, double speed) {
        this.maker = maker;
        this.speed = speed;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    @Override
    public String toString() {
        return maker + " " + speed; 
    }
}
