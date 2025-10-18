package DecoratorPattern;

public abstract class RoomDecorator implements IBooking {
    protected IBooking booking;

    public RoomDecorator(IBooking booking) {
        this.booking = booking;
    }

    @Override
    public String getDescription() {
        return booking.getDescription();
    }

    @Override
    public double getPrice() {
        return booking.getPrice();
    }
}
