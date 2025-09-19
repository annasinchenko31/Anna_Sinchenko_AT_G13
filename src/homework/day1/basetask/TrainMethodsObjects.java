package homework.day1.basetask;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println("Имя мышки: " + mouse.getName());
        System.out.println("Возраст мышки: " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce) {
        System.out.println("Имя соуса: " + souce.getName());
        System.out.println("Цвет соуса: " + souce.getColor());
        souce.printSouceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println("Пол пчелы: " + bee.getGender());
        System.out.println("Вес пчелы: " + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("Описание: " + obstacle.getDescription());
        System.out.println("Важность: " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println("Сорт: " + pineapple.getGrade() + "Теплоемкость: " + pineapple.getHeatCapacity());
        //System.out.println(pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}