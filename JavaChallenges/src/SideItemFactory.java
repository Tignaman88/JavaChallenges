public class SideItemFactory {

    public static SideItem getSideItem(String sideItemType) {

        switch (sideItemType) {

            case "Chips":
                return new SideItemChips();
            case "Onion Rings":
                return new SideItemOnionRings();
            default:
                return null;
        }
    }
}
