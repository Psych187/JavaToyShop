package model;

public class ConstructorToy extends Toy {
    public ConstructorToy(int id, int weight, String name) {
        super(id, weight, name);
    }

    @Override
    public String getToyType() {
        return "Constructor";
    }
}