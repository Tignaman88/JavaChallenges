public class SideItemOnionRings extends SideItem {

    protected String sideItemType = "Onion Rings";
    protected double sideItemPrice = 1.5;

    @Override
    public String getSideItemType() {
        return sideItemType;
    }

    @Override
    public double getSideItemPrice() {
        return sideItemPrice;
    }
}
