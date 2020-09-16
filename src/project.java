import data.Data;
import fileHandler.FileHandler;
import pcb.PCB;
import scheduling.Scheduling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class project {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("./src/processos.txt");
        Scheduling s = new Scheduling();
        Data data = fileHandler.readFile();
        ArrayList<PCB> list1 = new ArrayList<PCB>(data.list);
        Collections.copy(list1, data.list);
        ArrayList<PCB> list2= new ArrayList<PCB>(data.list);;
        Collections.copy(list2, data.list);

        System.out.println("STF: "+s.shorttestFirst(list2));
        System.out.println("Lottery: "+s.lottery(list1, data.quantum));

    }
}
