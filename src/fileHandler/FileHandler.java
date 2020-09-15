package fileHandler;

import data.Data;
import pcb.PCB;

import java.io.*;
import java.util.Scanner;

public class FileHandler {

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public String fileName;


    public Data readFile(){

        Data data = new Data();

        Scanner reader;
        try {
            reader = new Scanner(new File(fileName));
            System.out.println("Total de processos: "+(Integer.parseInt(reader.nextLine())));
            data.quantum = Float.parseFloat(String.valueOf(reader.nextLine()));


            while (reader.hasNext()){
                PCB pcb = new PCB(Integer.parseInt(reader.nextLine()),reader.nextLine(),
                        Integer.parseInt(reader.nextLine()),Integer.parseInt(reader.nextLine()));
                data.list.add(pcb);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();}


        return data;
    }

}
