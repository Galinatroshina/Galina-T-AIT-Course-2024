package classwork_37.city_bus;

//- создать список городских маршрутов на основе автобусов из городского автопарка;
//- отсортировать автобусы в порядке убывания их вместимости;
//- подсчитать общую вместимость автобусов из автопарка.

import java.util.Objects;

public class Bus implements Comparable<Bus> {

    private String model;
    private String regNummer;
    private String route;
    private int busCapacity;

    public Bus(String model, String regNummer, String route, int busCapacity) {
        this.model = model;
        this.regNummer = regNummer;
        this.route = route;
        this.busCapacity = busCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNummer() {
        return regNummer;
    }

    public void setRegNummer(String regNummer) {
        this.regNummer = regNummer;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        return busCapacity == bus.busCapacity && Objects.equals(model, bus.model) && Objects.equals(regNummer, bus.regNummer) && Objects.equals(route, bus.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, regNummer, route, busCapacity);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("model='").append(model).append('\'');
        sb.append(", regNummer='").append(regNummer).append('\'');
        sb.append(", route='").append(route).append('\'');
        sb.append(", busCapacity=").append(busCapacity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Bus o) {
        return - Integer.compare(this.getBusCapacity(), o.getBusCapacity());
    }
}
