package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] agrs) {
        TrainMethodsReturn runner = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + runner.returnNewInt(3));
        System.out.println("метод returnNewLong вернул " + runner.returnNewLong(123));
        System.out.println("метод returnNewChar вернул " + runner.returnNewChar('!'));
        System.out.println("метод returnNewFloat вернул " + runner.returnNewFloat(22.22F));
        System.out.println("метод returnNewDouble вернул " + runner.returnNewDouble(44.4));
        System.out.println("метод returnNewShort вернул " + runner.returnNewShort((short) 9));
        System.out.println("метод returnNewByte вернул " + runner.returnNewByte((byte) 5));
        System.out.println("метод returnNewBoolean вернул " + runner.returnNewBoolean(true));

    }
}

