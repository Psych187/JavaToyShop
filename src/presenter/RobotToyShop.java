package presenter;

import model.RobotToy;
import model.Toy;

public class RobotToyShop implements ToyShop {
    @Override
    public Toy createToy(int id, int weight, String name) {
        return new RobotToy(id, weight, name);
    }
}
