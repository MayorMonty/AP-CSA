public class CookieOrder {

    private String variety = "";
    private int count = 0;

    public CookieOrder(String variety, int count) {
        this.variety = variety;
        this.count = count;
    }

    public String getVariety() {
        return this.variety;
    }

    public int getNumBoxes() {
        return this.count;
    }

}