package az.example.designpatterns.behavioral.chainofresponsibility;

public class XCargo {
    public static CargoCompany getCargoCompany() {
        BakuOffice bakuOffice = new BakuOffice();
        SumgayitOffice sumgayitOffice = new SumgayitOffice();
        GanjaOffice ganjaOffice = new GanjaOffice();
        LankaranOffice lankaranOffice = new LankaranOffice();
        ShakiOffice shakiOffice = new ShakiOffice();

        CargoCompany xCargo = bakuOffice
                .setNextCargoCompany(
                        sumgayitOffice.setNextCargoCompany(
                                lankaranOffice.setNextCargoCompany(
                                        shakiOffice.setNextCargoCompany(
                                                ganjaOffice
                                        )
                                )
                        )
                );

        return xCargo;
    }
}
