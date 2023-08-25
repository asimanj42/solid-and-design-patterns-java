package az.example.solidprinciples.i;

public class Worker implements SalaryInterface{
    @Override
    public void salary() {
        System.out.println("Worker salary");
    }
}
