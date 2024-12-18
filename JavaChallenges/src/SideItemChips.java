public class SideItemChips extends SideItem {

    protected String sideItemType = "Chips";
    protected double sideItemPrice = 3.0;

    @Override
    public String getSideItemType() {
        return sideItemType;
    }

    @Override
    public double getSideItemPrice() {
        return sideItemPrice;
    }
}
