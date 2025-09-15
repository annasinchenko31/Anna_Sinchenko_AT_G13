package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects runner = new TrainMethodsObjects();

        Mouse mouse1 = new Mouse ("Жужа", 1);
        runner.processMouse(mouse1);
        runner.processSouce(new Souce("Бальзамик ", "коричневого"));
        runner.processBee(new Bee("Ж", 2));
        runner.processObstacle(new Obstacle("- таск 555", "критическое"));
        runner.processPineapple(new Pineapple("Абакакси", 123.4));
    }
}
