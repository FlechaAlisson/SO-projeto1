package monitor;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.Semaphore;

public class Leitor extends  Thread {
    RC rc;
    Integer leitor;
    Semaphore mutex;
    Semaphore db;

    public Leitor(RC rc, Semaphore mutex, Semaphore db, Integer leitor) {
        this.rc = rc;
        this.mutex = mutex;
        this.db = db;
        this.leitor = leitor;
    }



    @Override
    public void run() {
        System.out.println("Leitor "+leitor+ " está esperando permissao pra ler ");
        while (true){
            try{
                mutex.acquire();

                rc.setRc(rc.getRc() + 1);
                if (rc.getRc() == 1) {
                    db.acquire();
                }
                mutex.release();

                synchronized (this){
                    wait(1000);
                    System.out.println("Leitor "+leitor+" esta lendo");

                }

               mutex.acquire();

                rc.setRc(rc.getRc() - 1);
                if (rc.getRc() == 0) {
                    db.release();
                }
                mutex.release();

                System.out.println("O leitor "+leitor+" terminou de ler");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
