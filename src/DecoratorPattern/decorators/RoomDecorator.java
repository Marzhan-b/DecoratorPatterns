package DecoratorPattern.decorators;

import DecoratorPattern.IBooking;

public class RoomDecorator implements IBooking {
    protected IBooking booking;

    public RoomDecorator(IBooking booking) {
        this.booking = booking;
    }

    @Override
    public String getDescription() {
        return booking.getDescription();
    }

    @Override
    public float getPrice() {
        return booking.getPrice();
    }
}
