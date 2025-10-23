package DecoratorPattern.decorators;

import DecoratorPattern.IBooking;

public class SeaViewDecorator extends RoomDecorator {
    private float viewCost;

    public SeaViewDecorator(IBooking booking, float viewCost) {
        super(booking);
        this.viewCost = viewCost;
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + Sea View";
    }

    @Override
    public float getPrice() {
        return booking.getPrice() + viewCost;
    }
}
