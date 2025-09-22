package playground.runners;

import playground.essence.Flyable;
import playground.essence.craft.Transportable;
import playground.essence.craft.Rideable;
import playground.essence.craft.air.*;
import playground.essence.craft.field.*;
import playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {

    public static void main(String[] args) {

        TransportableProcessor processor = new TransportableProcessor();

        Car vehicleCar = new Car(23, "Tesla X Vehicle");
        Moped vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Motorbike vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");


        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");

        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");


        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");


        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        System.out.println("Random coordinates");
        processor.runTransportable(vehicleCar);
        processor.runTransportable(vehicleMoped);
        processor.runTransportable(vehicleMotorbike);

        processor.runTransportable(aircraftCopter);
        processor.runTransportable(aircraftPlane);
        processor.runTransportable(aircraftRocket);

        processor.runTransportable(aCopter);
        processor.runTransportable(aPlane);
        processor.runTransportable(aRocket);
        processor.runTransportable(aCar);
        processor.runTransportable(aMoped);
        processor.runTransportable(aMotorbike);

        // Flyable и Rideable напрямую Transportable не реализуют
        // processor.runTransportable(flyableCopter);
        // processor.runTransportable(flyablePlane);
        // processor.runTransportable(flyableRocket);
        // processor.runTransportable(rideableCar);
        // processor.runTransportable(rideableMoped);
        // processor.runTransportable(rideableMotorbike);

        System.out.println("Fixed coordinates");
        processor.runTransportable(aCopter, 23, 242);
        processor.runTransportable(aCar, 93, 7);
    }
}
