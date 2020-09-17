package data;

import pcb.PCB;

import java.util.ArrayList;

public class Data {
    public  final ArrayList<PCB> list;
    public final float quantum;

    public Data(ArrayList<PCB> pcbList_aux, float quantum) {
        this.quantum = quantum;
        this.list = pcbList_aux;
    }

    @Override
    public String toString() {
        return "Data{" +
                "list=" + list + "\n" +
                ", quantum=" + quantum + "\n" +
                '}';
    }

    public ArrayList<PCB> cloneList (){
        ArrayList<PCB> newList = new ArrayList();
        for (PCB p : list) {
            newList.add(new PCB(p.getId(),p.getState(), p.getTimeNecessary(), p.getPriority()));
        }
        return newList;
    }
}
