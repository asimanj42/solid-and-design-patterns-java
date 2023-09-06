package az.example.designpatterns.behavioral.chainofresponsibility;

public enum EnumCity {
    BAKU("Baku"),
    GANJA("Ganja"),
    SUMGAYIT("Sumgayit"),
    LANKARAN("Lankaran"),
    SHAKI("Shaki"),
    GUBA("Guba");

    private String city;

    EnumCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return city;
    }
}
