package DecoratorPattern.decorators;

import DecoratorPattern.IBooking;

public class SeaViewDecorator extends RoomDecorator {
    private double viewCost;

    public SeaViewDecorator(IBooking booking, double viewCost) {
        super(booking);
        this.viewCost = viewCost;
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + Sea View";
    }

    @Override
    public double getPrice() {
        return booking.getPrice() + viewCost;
    }
}
