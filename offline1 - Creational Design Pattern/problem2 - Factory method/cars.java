abstract class cars {
    String name;
    String color;
    String engine;
    String manufacturingCountry;
    String wheels;

    public cars()
    {
        this.name = null;
        this.color = null;
        this.manufacturingCountry = null;
        this.engine = null;
        this.wheels = null;
    }

    public void printCar()
    {
        System.out.println("----------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Manufacturer: " + this.manufacturingCountry);
        System.out.println("Engine: " + this.engine);
        System.out.println("Wheels: " + this.wheels);
        System.out.println("----------------------------------------");

    }
}
