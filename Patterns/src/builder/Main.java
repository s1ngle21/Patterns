package builder;

public class Main {
    public static void main(String[] args) {


        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.createCoupeCar(builder);
        Car coupeCar = builder.buildCar();
        System.out.println(coupeCar);

        director.createHatchbackCar(builder);
        Car hatchBackCar = builder.buildCar();
        System.out.println(hatchBackCar);

        director.createSedanCar(builder);
        Car sedanCar = builder.buildCar();
        System.out.println(sedanCar);
    }

}
