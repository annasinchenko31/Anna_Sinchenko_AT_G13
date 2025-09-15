package cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        OneTask runnerO = new OneTask();
        runnerO.printOneTask();
        System.out.println();

        TwoTask runnerT = new TwoTask();
        runnerT.printTwoTask();
        System.out.println();

        ThreeTask runnerTh = new ThreeTask();
        runnerTh.printThreeTask();
        System.out.println();

        FourTask runnerF = new FourTask();
        runnerF.printFourTask();
        System.out.println();

        FiveTask runnerFi = new FiveTask();
        runnerFi.printFiveTask();
        System.out.println();

        SixTask runnerSi = new SixTask();
        runnerSi.printSixTask();
        System.out.println();

        SevenTask runnerSev = new SevenTask();
        runnerSev.printSevenTask();
        System.out.println();

        EightTask runnerE = new EightTask();
        runnerE.printEightTask();
        System.out.println();

        NineTask runnerN = new NineTask();
        runnerN.printNineTask();
        System.out.println();

        TenTask runnerTen = new TenTask();
        runnerTen.printTenTask();
        System.out.println();

    }
}
