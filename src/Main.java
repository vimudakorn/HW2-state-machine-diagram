// 6510405792 Vimudakorn Kittechapanich

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.printDetail();

        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();

        gumballMachine.printDetail();

        gumballMachine.insertsQuarter();
        gumballMachine.ejectsQuarter();
        gumballMachine.turnsCrank();

        gumballMachine.printDetail();

        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();
        gumballMachine.ejectsQuarter();

        gumballMachine.printDetail();

        gumballMachine.insertsQuarter();
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();
        gumballMachine.insertsQuarter();
        gumballMachine.turnsCrank();

        gumballMachine.printDetail();
    }
}