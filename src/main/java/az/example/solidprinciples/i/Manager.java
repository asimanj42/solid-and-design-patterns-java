package az.example.solidprinciples.i;

public class Manager implements ManagerInterface{

    @Override
    public void salary() {
        System.out.println("Manager salary");
    }

    @Override
    public void hire() {
        System.out.println("Manager hire");
    }

    @Override
    public void train() {
        System.out.println("Manager train");
    }
}
