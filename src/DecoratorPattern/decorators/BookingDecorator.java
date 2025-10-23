package DecoratorPattern.decorators;

import DecoratorPattern.IBooking;

public abstract class BookingDecorator implements IBooking {
    protected IBooking booking;

    public BookingDecorator(IBooking booking) {
        this.booking = booking;
    }

    public IBooking getBooking() {
        return booking;
    }

    public void setBooking(IBooking booking) {
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

