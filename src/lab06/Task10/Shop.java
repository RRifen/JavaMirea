package lab06.Task10;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<Computer> computers;

    Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(String processorName, String memoryName, String monitorName, Brands brand) {
        computers.add(new Computer(processorName, memoryName, monitorName, brand));
    }

    public boolean deleteComputer(String processorName, String memoryName, String monitorName, Brands brand) {
        Computer checkComputer;
        for (int i = 0; i < computers.size(); i++) {
            checkComputer = computers.get(i);
            if (checkComputer.getBrand() == brand &&
                    checkComputer.getMemory().equals(memoryName) &&
                    checkComputer.getMonitor().equals(monitorName) &&
                    checkComputer.getProcessor().equals(processorName)) {
                computers.remove(i);
                return true;
            }
        }
        return false;
    }

    public Computer findComputer(String processorName, String memoryName, String monitorName, Brands brand) {
        Computer checkComputer;
        for (Computer computer : computers) {
            checkComputer = computer;
            if (checkComputer.getBrand() == brand &&
                    checkComputer.getMemory().equals(memoryName) &&
                    checkComputer.getMonitor().equals(monitorName) &&
                    checkComputer.getProcessor().equals(processorName)) {
                return checkComputer;
            }
        }
        return null;
    }

    public void printComputers() {
        for(Computer i: computers) {
            System.out.println(i);
        }
    }

}
