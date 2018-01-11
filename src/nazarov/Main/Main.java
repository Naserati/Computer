package nazarov.Main;

import nazarov.Interfaces.Computer;
import nazarov.Interfaces.ComputerConveyor;
import nazarov.MyComputer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        MyComputer computer = (MyComputer) context.getBean("computer");
        computer.start();

        ComputerConveyor conveyor = (ComputerConveyor) context.getBean("conveyor");
        Computer computer1 = conveyor.createComputer();
        Computer computer2 = conveyor.createComputer();
        Computer computer3 = conveyor.createComputer();

        System.out.println("Computer 1 " + computer1);
        System.out.println("Computer 2 " + computer2);
        System.out.println("Computer 3 " + computer3);

    }
}
