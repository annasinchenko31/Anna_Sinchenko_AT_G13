package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf runner = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул " + runner.returnNewInt(22));
        System.out.println("метод returnNewLong вернул " + runner.returnNewLong(50000));
        System.out.println("метод returnNewChar вернул " + runner.returnNewChar('g'));
        System.out.println("метод returnNewFloat вернул " + runner.returnNewFloat(0.67F));
        System.out.println("метод returnNewDouble вернул " + runner.returnNewDouble(1.5));
        runner.returnNewBoolean(true);

    }
}
