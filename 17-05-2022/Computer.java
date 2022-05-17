import java.util.*;
class CPU{
    double price;
    
    class Processor{
        double cores;
        String manufacturer;     
    }
    static class RAM{
       static double memory;
        String manufacturer;    
    }
}

public class Computer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = new CPU.RAM();
        System.out.println("~~~CPU~~~");
        System.out.println("Enter price: ");
        cpu.price = sc.nextDouble();
        
        System.out.println("~~~CPU Processor~~~");
        System.out.println("Enter manufacturer: ");
        processor.manufacturer = sc.next();
        System.out.print("Enter core: ");
        processor.cores = sc.nextDouble();
        
        System.out.println("~~~CPU RAM~~~");
        System.out.println("Enter manufacturer: ");
        ram.manufacturer = sc.next();
        System.out.print("Enter memory: ");
        ram.memory = sc.nextDouble();
        
        System.out.println("CPU Price = " + cpu.price);
        System.out.println("Processor core = " + processor.cores);
        System.out.println("Processor Manufacturer = " + processor.manufacturer);
        System.out.println("RAM memory = " + Cpu.ram.memory);
        System.out.println("RAM manufacturer = " + ram.manufacturer);
    }
}