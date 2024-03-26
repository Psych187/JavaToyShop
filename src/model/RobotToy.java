package model;

public class RobotToy extends Toy {
    public RobotToy(int id, int weight, String name) {
        super(id, weight, name);
    }

    @Override
    public String getToyType() {
        return "Robot";
    }
}
