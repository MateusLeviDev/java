package Collections.Domain;

import java.util.Objects;

public class Smartphone {
    private String serialNumber;
    private String name;

    public Smartphone(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    //reflexivo: x.equals(x) tem qu ser true para tudo dff de null
    //simétrico: x.equals(y) true então y.equals(x) deve ser true. para x e y dff de null
    //transitividade: x,y,z dff de null, x.equals(y) true x.equals(z) true entao y.equals(z) é true
    //consistente: x.equals(x) smp true se x n for false
    //para x dff de null, x.equals(null) deve ser false
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        Smartphone smartphone = (Smartphone) o;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSerialNumber(), getName());
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
