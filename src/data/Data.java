package data;

import pcb.PCB;

import java.util.ArrayList;

public class Data {
    public ArrayList<PCB> list = new ArrayList();
    public float quantum;

    @Override
    public String toString() {
        return "Config{" +
                "list=" + list +
                ", quantum=" + quantum +
                '}';
    }
}
