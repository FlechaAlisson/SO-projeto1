package monitor;


import java.util.concurrent.Semaphore;

public class Monitor {


    public static void main(String[] args) {
        RC rc = new RC(0);
        Semaphore mutex = new Semaphore(1, true);
        Semaphore db = new Semaphore(1,true);


        Thread[] leitores = new Thread[5];
        for (int i = 0; i < 4; i++) {

            leitores[i] = new Thread(new Leitor(rc, mutex, db, i), "leitor "+i);
        }


        Thread escritor = new Thread(new Escritor(db), "escritor");

        escritor.start();

        for (int i = 0; i < 4; i++) {
            leitores[i].start();
        }







    } }

