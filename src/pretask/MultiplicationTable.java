package pretask;

public class MultiplicationTable {
    public void main(String[] args) {
        int a = 5;
        for (int i = 1; i < 11; i++) {
            int y = i * a;
            System.out.println(i + "*" + a + "= " + y);
        }
    }
}