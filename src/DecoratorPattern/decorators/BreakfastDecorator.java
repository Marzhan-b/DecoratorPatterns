package DecoratorPattern.decorators;

import DecoratorPattern.IBooking;

public class BreakfastDecorator extends RoomDecorator {
    private float breakfastCost;

    public BreakfastDecorator(IBooking booking, float breakfastCost) {
        super(booking);
        this.breakfastCost = breakfastCost;
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + Breakfast";
    }

    @Override
    public float getPrice() {
        return booking.getPrice() + breakfastCost;
    }
}
