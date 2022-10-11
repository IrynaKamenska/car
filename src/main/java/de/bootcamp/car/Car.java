package de.bootcamp.car;


import java.util.Objects;

public class Car {
    private String hersteller;
    private int anzahlReifen;
    private boolean tuevPlakete;

    private String id;

    public Car(String id, String hersteller, int anzahlReifen, boolean tuevPlakete) {
        this.id = id;
        this.hersteller = hersteller;
        this.anzahlReifen = anzahlReifen;
        this.tuevPlakete = tuevPlakete;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getAnzahlReifen() {
        return anzahlReifen;
    }

    public void setAnzahlReifen(int anzahlReifen) {
        this.anzahlReifen = anzahlReifen;
    }

    public boolean isTuevPlakete() {
        return tuevPlakete;
    }

    public void setTuevPlakete(boolean tuevPlakete) {
        this.tuevPlakete = tuevPlakete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hersteller='" + hersteller + '\'' +
                ", anzahlReifen=" + anzahlReifen +
                ", tuevPlakete=" + tuevPlakete +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return anzahlReifen == car.anzahlReifen && tuevPlakete == car.tuevPlakete && hersteller.equals(car.hersteller) && id.equals(car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hersteller, anzahlReifen, tuevPlakete, id);
    }
}
