package DecoratorPattern.decorators;

import DecoratorPattern.IBooking;

public class VIPServiceDecorator extends RoomDecorator {
    private double vipCost;

    public VIPServiceDecorator(IBooking booking, double vipCost) {
        super(booking);
        this.vipCost = vipCost;
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + VIP Service";
    }

    @Override
    public double getPrice() {
        return booking.getPrice() + vipCost;
    }
}

