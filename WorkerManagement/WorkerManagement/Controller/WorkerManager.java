
package Controller;

import View.Menu;
import Model.History;
import Model.Worker;
import Repository.WorkerRepository;
import java.util.ArrayList;


public class WorkerManager extends Menu<String>{
    static String[] mc = {"Add Worker", "Up salary", "Down salary", "Display Information salary", "Exit"};
    WorkerRepository program;
    ArrayList<Worker> workerList;
    ArrayList<History> historyList;

    public WorkerManager() {
        super("\nWorker Management", mc);
        program = new WorkerRepository();
        workerList = new ArrayList<>();
        historyList = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.addWorker(workerList);
                break;
            case 2:
                program.changeSalary(workerList, historyList, "UP");
                break;
            case 3:
                program.changeSalary(workerList, historyList, "DOWN");
                break;
            case 4:
                program.printListHistory(historyList);
                break;
            case 5:
                System.exit(0);
        }
    }
}
