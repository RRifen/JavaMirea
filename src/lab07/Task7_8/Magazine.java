package lab07.Task7_8;

public class Magazine implements Printable{
    private String name;

    Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + name);
    }

    public static void printMagazines(Printable[] printable) {
        for(Printable inst : printable) {
            if (inst instanceof Magazine) {
                inst.print();
            }
        }
    }

}
