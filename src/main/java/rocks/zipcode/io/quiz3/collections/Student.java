package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private List<Lab> list;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.list = labs;
    }

    public Lab getLab(String labName) {
        for (Lab element : list) {
            if (element.getName().equals(labName)) {
                return element;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for (Lab element : list) {
            if (element.getName().equals(labName)) {
                element.setStatus(labStatus);
            }
        } if (getLab(labName) == null) {
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        list.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab element : list) {
            if (element.getName().equals(labName)) {
                return element.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String string = "";

        for (int i = list.size() - 1; i > -1; i--) {
            if (i == 0) {
                string += list.get(i).getName() + " > " + list.get(i).getStatus();
            } else
            string += list.get(i).getName() + " > " + list.get(i).getStatus() + "\n";
        }

        return string;
    }
}
