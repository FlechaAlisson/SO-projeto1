package fileHandler;

import data.Data;
import pcb.PCB;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public String fileName;


    public Data readFile(){

        Data data = null;

        Scanner reader;
        try {
            reader = new Scanner(new File(fileName));
            System.out.println("Total de processos: "+(Integer.parseInt(reader.nextLine())));
            float quantum_aux = Float.parseFloat(String.valueOf(reader.nextLine()));
            ArrayList<PCB> pcbList_aux = new ArrayList();

            while (reader.hasNext()){
                PCB pcb = new PCB(Integer.parseInt(reader.nextLine()),reader.nextLine(),
                        Float.parseFloat(reader.nextLine()),Integer.parseInt(reader.nextLine()));
                pcbList_aux.add(pcb);

            }

            data = new Data(pcbList_aux, quantum_aux);

        } catch (FileNotFoundException e) {
            e.printStackTrace();}


        return data;
    }


    public void writeData(ArrayList<PCB> list, String metodo){
        File file = new File(metodo+".txt");


        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();

        }


        FileWriter fw = null;
        try {
            fw = new FileWriter(file.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);

        for (PCB p : list) {

            try {
                bw.write("PID: " + p.getId());
                bw.newLine();
                bw.write("Estado: " + p.getState());
                bw.newLine();
                bw.write("Prioridade: " + p.getPriority());
                bw.newLine();
                bw.write("=========================================================\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
