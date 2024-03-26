package presenter;

import model.DollToy;
import model.Toy;

public class DollToyShop implements ToyShop {
    @Override
    public Toy createToy(int id, int weight, String name) {
        return new DollToy(id, weight, name);
    }
}
