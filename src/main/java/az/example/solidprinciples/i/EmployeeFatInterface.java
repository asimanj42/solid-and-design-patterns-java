package az.example.solidprinciples.i;

//This interface violated Interface Segregation Principle
public interface EmployeeFatInterface {
    // CEO + managers + workers
    public void salary();
    // managers
    public void hire();
    public void train();
    // CEO
    public void makeDecisions();
    public void addStocks();
}