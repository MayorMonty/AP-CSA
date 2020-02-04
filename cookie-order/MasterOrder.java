import java.util.List;

public class MasterOrder {

    private List<CookieOrder> orders;

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

        for (CookieOrder order : orders) {
            if (order.getVariety().equals(variety)) {
                orders.remove(order);
                removed += order.getNumBoxes();
            }
        }

        return removed;

    }

}