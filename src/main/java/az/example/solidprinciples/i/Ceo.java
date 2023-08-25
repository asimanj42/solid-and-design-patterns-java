package az.example.solidprinciples.i;

public class Ceo implements CeoInterface{
    @Override
    public void makeDecisions() {
        System.out.println("Ceo make decisions");
    }

    @Override
    public void addStocks() {
        System.out.println("Ceo add stocks");
    }


    @Override
    public void salary() {
        System.out.println("Ceo salary");
    }
}
