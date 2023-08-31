public class Car extends Vehicle{
    private String brand;

    protected void honk() {
        System.out.println("Honk, honk!");

    }
    protected void displayInfo() {
        System.out.println(getNumberOfWheels());
        System.out.println(getColor());
        System.out.println(getEngineSize());
        System.out.println(getFuelType());
        System.out.println(brand);
    }

}
