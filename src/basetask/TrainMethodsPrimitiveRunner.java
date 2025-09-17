package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive runner = new TrainMethodsPrimitive();
        runner.printInt(12);
        runner.printLong(1234567);
        runner.printChar('?');
        runner.printFloat(457.74F);
        runner.printDouble(118425.99);
        runner.printShort((short) 6);
        runner.printByte((byte) 2);
        runner.printBoolean(true);
    }
}
