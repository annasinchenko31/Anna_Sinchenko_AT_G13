package basetask;

public class Bee {
    String gender;
    long weight;

    public Bee (String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }
    public String getGender() {
        return gender;
    }
    public long getWeight() {
        return weight;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setWeight(long weight) {
        this.weight = weight;
    }
    public void printBeeDetails () {
        int i = 500 / (int) this.weight;
        System.out.println("Я легче лося в " + i + " раз");
    }
}
