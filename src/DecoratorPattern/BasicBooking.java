package DecoratorPattern;
public class BasicBooking implements IBooking {
    private String bookingName;
    private double basePrice;

    public BasicBooking(String bookingName, double basePrice) {
        this.bookingName = bookingName;
        this.basePrice = basePrice;
    }

    @Override
    public String getDescription() {
        return bookingName + " (Base booking)";
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
