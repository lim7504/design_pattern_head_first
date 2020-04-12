package decorate;

public class Main {
    public static void main(String[] args) {

        Decorate itemA = new ItemA();

        Option1 option1 = new Option1(itemA);
        Option2 option2 = new Option2(option1);

        System.out.println("option2 = " + option2.cost());


    }
}
