package homework_40.tree_set;

public class Medication implements Comparable<Medication> {

    private String name;
    private double price;

    public Medication(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medication{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Medication medication) {
        return this.name.compareTo(medication.name);
    }
}
