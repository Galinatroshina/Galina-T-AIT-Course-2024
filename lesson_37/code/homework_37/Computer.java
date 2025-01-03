package homework_37;

//На основе класса Computer:
//
//создать собственный ArrayList;
//добавить в него не менее 6 элементов;
//отсортировать список по бренду;
//отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
//подсчитать общий суммарный объем и среднее значение SSD.

import java.util.Objects;

public class Computer implements Comparable<Computer> {

    private String brand;
    private int ram;
    private int ssd;

    public Computer(String brand, int ram, int ssd) {
        this.brand = brand;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ram, ssd);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Computer o) {
        return - Integer.compare(this.getSsd(), o.getSsd());
    }
}
