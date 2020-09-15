import data.Data;
import fileHandler.FileHandler;
import scheduling.Scheduling;


public class project {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("C:/Users/afcfl/IdeaProjects/project1/src/processos.txt");
        Scheduling s = new Scheduling();
        Data data = fileHandler.readFile();
        System.out.println(s.lottery(data.list, data.quantum));

    }
}
