public class StarbuzzCoffee {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();

        espresso.addCondiment(new Milk());
        espresso.addCondiment(new Sugar());

        System.out.println(espresso.cost());
    }
}
