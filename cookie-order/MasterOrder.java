import java.util.ArrayList;

public class MasterOrder {

    private ArrayList<CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder order) {
        orders.add(order);
    }

    public int getTotalBoxes() {
        int sum = 0;

        for (CookieOrder order : orders) {
            sum += order.getNumBoxes();
        }

        return sum;
    }

    public int removeVariety(String variety) {
        int removed = 0;

        for (int i = 0; i < orders.size(); i++) {
            CookieOrder order = orders.get(i);
            if (order.getVariety().equals(variety)) {
                orders.remove(order);
                removed += order.getNumBoxes();
            }
        }

        return removed;

    }

    public void showOrder() {

        for (CookieOrder order : orders) {
            System.out.println(order.getVariety() + " x" + order.getNumBoxes());
        }

    }

}