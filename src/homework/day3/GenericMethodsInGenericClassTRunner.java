package homework.day3;

import playground.essence.Matter;
import playground.essence.creatures.*;
import playground.essence.craft.air.*;
import playground.essence.craft.field.*;
import playground.essence.craft.hand.*;
import playground.essence.material.*;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Car> carGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> mopedGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbikeGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> planeGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> bottleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrolGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> dieselGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> waterGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquitoGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> flyGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> beetleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeonGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> ravenGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylilyGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> roseGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomileGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potatoGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrotGeneric = new GenericMethodsInGenericClassT<>();
        //GenericMethodsInGenericClassT<Red> redGeneric = new GenericMethodsInGenericClassT<>();

        Car car = new Car(1000, "Tesla");
        Moped moped = new Moped(50, "Honda");
        Motorbike motorbike = new Motorbike(120, "Suzuki");
        Copter copter = new Copter(500, "AW109");
        Plane plane = new Plane(2000, "Boeing");
        Rocket rocket = new Rocket(3000, "Soyuz");
        Bottle bottle = new Bottle(1, "Water Bottle");
        Can can = new Can(2, "Food Can");
        Mug mug = new Mug(3, "Coffee Mug");
        Petrol petrol = new Petrol(50);
        Diesel diesel = new Diesel(60);
        Water water = new Water(100);
        Mosquito mosquito = new Mosquito(1, "Komarik");
        Fly fly = new Fly(2, "Domestica");
        Beetle beetle = new Beetle(2, "Buggy");
        Crocodile croc = new Crocodile(200, "Snappy");
        Pigeon pigeon = new Pigeon(300, "Pidgey");
        Raven raven = new Raven(400, "Ravie");
        Maylily maylily = new Maylily(5, "Maylily");
        Rose rose = new Rose(6, "Rose");
        Chamomile chamomile = new Chamomile(7, "Chamomile");
        Potato potato = new Potato(10, "Potato");
        Carrot carrot = new Carrot(12, "Carrot");
        //Red red = new Red(8, "Red"); // редис

        stringGeneric.genericMethodOneGenArg("Hello");
        integerGeneric.genericMethodOneGenArg(123);
        doubleGeneric.genericMethodOneGenArg(3.14);

        carGeneric.genericMethodOneGenArg(car);
        mopedGeneric.genericMethodOneGenArg(moped);
        motorbikeGeneric.genericMethodOneGenArg(motorbike);
        copterGeneric.genericMethodOneGenArg(copter);
        planeGeneric.genericMethodOneGenArg(plane);
        rocketGeneric.genericMethodOneGenArg(rocket);
        bottleGeneric.genericMethodOneGenArg(bottle);
        canGeneric.genericMethodOneGenArg(can);
        mugGeneric.genericMethodOneGenArg(mug);
        petrolGeneric.genericMethodOneGenArg(petrol);
        dieselGeneric.genericMethodOneGenArg(diesel);
        waterGeneric.genericMethodOneGenArg(water);
        mosquitoGeneric.genericMethodOneGenArg(mosquito);
        flyGeneric.genericMethodOneGenArg(fly);
        beetleGeneric.genericMethodOneGenArg(beetle);
        crocGeneric.genericMethodOneGenArg(croc);
        pigeonGeneric.genericMethodOneGenArg(pigeon);
        ravenGeneric.genericMethodOneGenArg(raven);
        maylilyGeneric.genericMethodOneGenArg(maylily);
        roseGeneric.genericMethodOneGenArg(rose);
        chamomileGeneric.genericMethodOneGenArg(chamomile);
        potatoGeneric.genericMethodOneGenArg(potato);
        carrotGeneric.genericMethodOneGenArg(carrot);
        //redGeneric.genericMethodOneGenArg(red);

        System.out.println(carGeneric.genericMethodTwoGenArgs(car, moped));
        System.out.println(flyGeneric.genericMethodTwoGenArgs(fly, mosquito));
        
        carGeneric.genericMethodHalfGenArgs(car, "CarString");
        mosquitoGeneric.genericMethodHalfGenArgs(mosquito, "Bzzzz");
        petrolGeneric.genericMethodHalfGenArgs(petrol, "Fuel");
        roseGeneric.genericMethodHalfGenArgs(rose, "Flower");
    }
}
