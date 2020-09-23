package monitor;

import java.util.concurrent.Semaphore;

public class Escritor  extends  Thread{

    Semaphore db;

    public Escritor( Semaphore db) {
        this.db = db;
    }


    @Override
    public void run() {
       while(true){
           try {
               System.out.println("O escritor vai começar a escrever");
               db.acquire();
               synchronized (this) {
                   this.wait(1000);
               }
               System.out.println("O escritor terminou de escrever");
               db.release();
           }catch (InterruptedException e){
               e.printStackTrace();
           }
       }

    }
}
