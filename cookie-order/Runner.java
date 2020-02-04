public class Runner {

    public static void main(String argv[]) {

        MasterOrder orders = new MasterOrder();

        orders.addOrder(new CookieOrder("Chocolate Chip", 10));
        orders.addOrder(new CookieOrder("Brownie", 16));
        orders.addOrder(new CookieOrder("Shortbread", 14));
        orders.addOrder(new CookieOrder("Walnut", 12));

        System.out.println("Inital Contents:");
        orders.showOrder();

        orders.removeVariety("Chocolate Chip");
        System.out.println("\n'Chocolate Chip' Removed:");
        orders.showOrder();
    }

}