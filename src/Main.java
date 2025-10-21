import DecoratorPattern.*;
import DecoratorPattern.decorators.BreakfastDecorator;
import DecoratorPattern.decorators.SeaViewDecorator;
import DecoratorPattern.decorators.VIPServiceDecorator;

public class Main {
    public static void main(String[] args) {

        IBooking basic = new BasicBooking("Standard Booking", 100.0);
        show(basic);

        IBooking breakfast = new BreakfastDecorator(basic, 20.0);
        show(breakfast);

        IBooking seaView = new SeaViewDecorator(breakfast, 50.0);
        show(seaView);


        IBooking vip = new VIPServiceDecorator(seaView, 100.0);
        show(vip);




    }

    private static void show(IBooking booking) {
        System.out.println("\n--- Booking Info ---");
        System.out.println(booking.getDescription());
        System.out.println("Total Price: $" + booking.getPrice());
    }
}
