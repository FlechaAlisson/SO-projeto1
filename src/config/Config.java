package config;

import pcb.Pcb;

import java.util.ArrayList;

public class Config {
    public ArrayList<Pcb> list = new ArrayList();
    public float quantum;

    @Override
    public String toString() {
        return "Config{" +
                "list=" + list +
                ", quantum=" + quantum +
                '}';
    }
}
