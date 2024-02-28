
package Repository;

import Model.History;
import Model.Worker;
import java.util.ArrayList;

public interface IWorkerRepository {
    void addWorker(ArrayList<Worker> lw);

    void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, String status);

    void printListHistory(ArrayList<History> lh);
}
