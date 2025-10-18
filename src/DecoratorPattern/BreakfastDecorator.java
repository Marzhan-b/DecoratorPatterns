package DecoratorPattern;

import DecoratorPattern.IBooking;

public class BreakfastDecorator extends RoomDecorator {
    private double breakfastCost;

    public BreakfastDecorator(IBooking booking, double breakfastCost) {
        super(booking);
        this.breakfastCost = breakfastCost;
    }

    @Override
    public String getDescription() {
        return booking.getDescription() + " + Breakfast";
    }

    @Override
    public double getPrice() {
        return booking.getPrice() + breakfastCost;
    }
}
