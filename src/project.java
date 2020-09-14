import config.Config;
import fileHandler.FileHandler;



public class project {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("C:/Users/afcfl/IdeaProjects/project1/src/processos.txt");
        Config config = fileHandler.readFile();
        System.out.println(config);

    }
}
