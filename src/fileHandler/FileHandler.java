package fileHandler;

import config.Config;
import pcb.Pcb;

import java.io.*;
import java.util.Scanner;

public class FileHandler {

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public String fileName;


    public Config readFile(){

        Config config = new Config();

        Scanner reader;
        try {
            reader = new Scanner(new File(fileName));
            System.out.println("Total de processos: "+(Integer.parseInt(reader.nextLine())));
            config.quantum = Float.parseFloat(String.valueOf(reader.nextLine()));


            while (reader.hasNext()){
                Pcb pcb = new Pcb(Integer.parseInt(reader.nextLine()),reader.nextLine(),
                        Integer.parseInt(reader.nextLine()),Integer.parseInt(reader.nextLine()));
                config.list.add(pcb);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();}


        return config;
    }

}
