package de.bootcamp.car;


import java.util.Objects;
import java.util.UUID;

public class Car {
    private final String id = UUID.randomUUID().toString();
    private String manufacter;
    private int amountOfTires;
    private boolean tuev;



    public Car(String manufacter, int amountOfTires, boolean tuev) {
        this.manufacter = manufacter;
        this.amountOfTires = amountOfTires;
        this.tuev = tuev;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public int getAmountOfTires() {
        return amountOfTires;
    }

    public void setAmountOfTires(int amountOfTires) {
        this.amountOfTires = amountOfTires;
    }

    public boolean isTuev() {
        return tuev;
    }

    public void setTuev(boolean tuev) {
        this.tuev = tuev;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Car{" +
                "hersteller='" + manufacter + '\'' +
                ", anzahlReifen=" + amountOfTires +
                ", tuevPlakete=" + tuev +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return amountOfTires == car.amountOfTires && tuev == car.tuev && manufacter.equals(car.manufacter) && id.equals(car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacter, amountOfTires, tuev, id);
    }
}
