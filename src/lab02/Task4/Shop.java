package lab02.Task4;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<Computer>();
    }

    public void addComp(Computer comp) {
        computers.add(comp);
    }

    public Computer search(String name) {
        for (Computer comp: computers) {
            if (comp.getName().equals(name)) {
                return comp;
            }
        }
        return null;
    }

}
