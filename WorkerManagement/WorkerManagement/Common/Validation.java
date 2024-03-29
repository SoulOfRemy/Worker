
package Common;

import Model.Worker;
import java.util.ArrayList;

public class Validation {
    public boolean checkIdExist(ArrayList<Worker> lw, String id) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWorkerExist(ArrayList<Worker> lw, String name, int age, int salary, String workLocation) {
        for (Worker worker : lw) {
            if (name.equalsIgnoreCase(worker.getName())
                    && age == worker.getAge()
                    && salary == worker.getSalary()) {
                return false;
            }
        }
        return true;
    }
}
