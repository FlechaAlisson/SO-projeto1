package scheduling;

import pcb.PCB;
import java.util.Random;

import java.util.ArrayList;

public class Scheduling {

    public ArrayList<PCB> lottery (ArrayList<PCB> list, float quantum){
        Random r = new Random();
        ArrayList<PCB> newList = new ArrayList();

        while(!list.isEmpty()) {

            int aux =  Math.abs(r.nextInt() % list.size());
            newList.add(list.get(aux));
            /*Seta o novo valor do tempo necessario pra terminar o processo
            * se o valor for menor do que 0, então ele só atribui o 0 */
            list.get(aux).setTimeNecessary((list.get(aux).getTimeNecessary() - quantum) < 0 ? 0 :
                    list.get(aux).getTimeNecessary() - quantum);
            if (list.get(aux).getTimeNecessary() <= 0)
                list.remove(aux);
        }
        return newList;
    }
}
