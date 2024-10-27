package test14;

public class Computer {
    String maker;
    String type;
    CPU cpu;
    
    Computer(CPU cpu, String maker, String type) {
        this.cpu = cpu;
        this.maker = maker;
        this.type = type;
    }
}
