package DecoratorPattern;
public class BasicBooking implements IBooking {
    private String bookingName;
    private float basePrice;

    public BasicBooking(String bookingName, float basePrice) {
        this.bookingName = bookingName;
        this.basePrice = basePrice;
    }

    @Override
    public String getDescription() {
        return bookingName + " (Base booking)";
    }

    @Override
    public float getPrice() {
        return basePrice;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }
}
