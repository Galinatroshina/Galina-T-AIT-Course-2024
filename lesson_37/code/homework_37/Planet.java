package homework_37;
//Занести планеты солнечной системы в список, содержащий:
//
//наименование;
//расстояние до Солнца;
//массу;
//количество спутников.
//Вывести список планет отсортированный по:
//
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.

import java.util.Objects;

public class Planet {

    private String name;
    private double distanceToSun;
    private double mass;
    private int satellite;

    public Planet(String name, double distanceToSun, double mass, int satellite) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.satellite = satellite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getSatellite() {
        return satellite;
    }

    public void setSatellite(int satellite) {
        this.satellite = satellite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet planet)) return false;
        return Double.compare(distanceToSun, planet.distanceToSun) == 0 && Double.compare(mass, planet.mass) == 0 && satellite == planet.satellite && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceToSun, mass, satellite);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planet{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceToSun=").append(distanceToSun);
        sb.append(", mass=").append(mass);
        sb.append(", satellite=").append(satellite);
        sb.append('}');
        return sb.toString();
    }


}
