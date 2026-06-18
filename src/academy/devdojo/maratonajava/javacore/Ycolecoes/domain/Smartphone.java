package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }


    //reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //simetrico: para x e y diferente de null, se x.equals(y) == true, y.equals(x) == true
    //transitividade: para x,y,z diferentes de null, se x.equals(y) == true e x.equals(z) == true, logo y.equals(z) == true
    @Override
    public boolean equals(Object obj) {
        if (obj==null){
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
