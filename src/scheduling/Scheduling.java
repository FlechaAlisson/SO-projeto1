package scheduling;

import pcb.PCB;
import java.util.Random;

import java.util.ArrayList;

public class Scheduling {

    public ArrayList<PCB> lottery (ArrayList<PCB> list){
        Random r = new Random();
        ArrayList<PCB> newList = new ArrayList();

        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {

            int aux =  Math.abs(r.nextInt() % list.size());
            PCB aux2 = list.remove(aux);
            newList.add(aux2);
        }
        return newList;
    }
}
