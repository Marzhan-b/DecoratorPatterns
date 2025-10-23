import DecoratorPattern.*;
import DecoratorPattern.decorators.BreakfastDecorator;
import DecoratorPattern.decorators.SeaViewDecorator;
import DecoratorPattern.decorators.VIPServiceDecorator;

public class Main {
    public static void main(String[] args) {

        IBooking basic = new BasicBooking("Standard Booking", 100.0f);
        show(basic);

        IBooking breakfast = new BreakfastDecorator(basic, 20.0f);
        show(breakfast);

        IBooking seaView = new SeaViewDecorator(breakfast, 50.0f);
        show(seaView);


        IBooking vip = new VIPServiceDecorator(seaView, 100.0f);
        show(vip);
        
    }

    private static void show(IBooking booking) {
        System.out.println("\n--- Booking Info ---");
        System.out.println(booking.getDescription());
        System.out.println("Total Price: $" + booking.getPrice());
    }
}
