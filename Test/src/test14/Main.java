package test14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    static CPU cpu1 = new CPU("Intel", 123456789);
    static CPU cpu2 = new CPU("Intel", 234567890);
    static CPU cpu3 = new CPU("AMD", 123456798);
    static CPU cpu4 = new CPU("TMCS", 2131424234);
    static CPU cpu5 = new CPU("NDIVIA", 1231423454);
    
    static Computer computer1 = new Computer(cpu1, "IBM", "Desktop");
    static Computer computer2 = new Computer(cpu2, "IBM", "Laptop");
    static Computer computer3 = new Computer(cpu3, "Hitachi", "Desktop");
    static Computer computer4 = new Computer(cpu4, "Dell", "Desktop");
    static Computer computer5 = new Computer(cpu5, "Dell", "laptop");
    
    public static void usingInnerClass(List<Computer> list) {
        class DellComputer implements Predicate<Computer> {
            @Override
            public boolean test(Computer c) {
                return c.maker.equals("Dell");
            }
        }
        
        class ComputerToCpu implements Function<Computer, CPU> {
            @Override
            public CPU apply(Computer c) {
                return c.cpu;
            }
        }
        
        class CpuSpeed implements Function<CPU, Double> {
            @Override
            public Double apply(CPU cpu) {
                return cpu.getSpeed();
            }
        }
        
        list.stream()
            .filter(new DellComputer())
            .map(new ComputerToCpu())
            .sorted(Comparator.comparing(new CpuSpeed()))
            .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        List<Computer> list = new ArrayList<>();
        list.add(computer1);
        list.add(computer2);
        list.add(computer3);
        list.add(computer4);
        list.add(computer5);
    
//        list.stream()
//            .filter(c -> c.maker.equals("Dell"))
//            .map(c -> c.cpu)
//            .sorted(Comparator.comparing(cpu -> cpu.speed, Comparator.reverseOrder()))
//            .forEach(System.out::println);
        
        list.stream()
            .filter(c -> c.maker.equals("Dell"))
            .map(c -> c.cpu)
            .sorted(Comparator.comparing(CPU::getSpeed).reversed())
            .forEach(System.out::println);
        
        
        usingInnerClass(list);
    }

}
