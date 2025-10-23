package DecoratorPattern.decorators;

import DecoratorPattern.IBooking;

public class VIPServiceDecorator extends RoomDecorator {
    private float vipCost;

    public VIPServiceDecorator(IBooking booking, float vipCost) {
        super(booking);
        this.vipCost = vipCost;
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + VIP Service";
    }

    @Override
    public float getPrice() {
        return booking.getPrice() + vipCost;
    }
}

