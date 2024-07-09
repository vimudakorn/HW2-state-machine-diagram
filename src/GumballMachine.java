// 6510405792 Vimudakorn Kittechapanich
public class GumballMachine {
    private String status;
    private int countGumball;
    GumballMachine(int countGumball) {
        this.countGumball = countGumball;
        if (countGumball > 0) {
            status = "No Quarter";
        }
        else {
            status = "Out of Gumballs";
        }
        System.out.println("%Java GumballMachineTestDrive");
    }


    public void insertsQuarter() {
        if (countGumball > 0) { // countGumball > 0
            if (status.equals("No Quarter")) {
                System.out.println("You inserted a quarter");
                setStatus("Has Quarter");
            }
            else {
                System.out.println("You can't insert another quarter");
            }
        }
        else {
            System.out.println("You can't insert a quarter, the machine is sold out");
        }
    }

    public void ejectsQuarter() {
        if (status.equals("Has Quarter")) {
            setStatus("No Quarter");
            System.out.println("Quarter returned");
        }
        else {
            System.out.println("You haven't inserted a quarter");
        }
    }

    public void turnsCrank() {
        if (status.equals("Has Quarter")) {
            setStatus("Gumball Sold");
            countGumball--;
            System.out.println("You turned...");
            System.out.println("A gumball come rolling out the slot");
            dispenseGumball();
        }
        else {
            System.out.println("You turned but there's no quarter");
        }


    }

    public void dispenseGumball() {
        if (countGumball > 0) {
            setStatus("No Quarter");
        }
        else {
            setStatus("Out of Gumballs");
            System.out.println("Oops, out of gumballs!");
        }
    }

    public void printDetail() {
        System.out.println();
        System.out.println("Mighty Gumball , Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory: " + countGumball + " gumballs");
        if (status.equals("Out of Gumballs")) {
            System.out.println("Machine is sold out");
        }
        else {
            System.out.println("Machine is waiting for quarter");
        }
        System.out.println();
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
