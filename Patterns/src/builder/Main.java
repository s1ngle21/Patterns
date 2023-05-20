package builder;

public class Main {
    public static void main(String[] args) {


        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.createCoupeCar(builder);
        Car coupeCar = builder.getResultCar();
        System.out.println(coupeCar);

        director.createHatchbackCar(builder);
        Car hatchBackCar = builder.getResultCar();
        System.out.println(hatchBackCar);

        director.createSedanCar(builder);
        Car sedanCar = builder.getResultCar();
        System.out.println(sedanCar);
    }

}
