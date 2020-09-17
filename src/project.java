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
        ArrayList<PCB> list1 = data.cloneList();
        ArrayList<PCB> list2= data.cloneList();


        System.out.println(data.list);
//
        System.out.println(s.shorttestFirst(list2));

        fileHandler.writeData(s.lottery(list1,data.quantum), "Lottery");

    }
}
