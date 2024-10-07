//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Chargeable[] list = new Chargeable[3];

            list[0] = new Phone();
            list[1] = new Laptop();
            list[2] = new Tablet();

            for (Chargeable i: list)
            {
                i.Charge();
            }
    }
}