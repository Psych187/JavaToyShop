package presenter;

import model.ConstructorToy;
import model.Toy;

public class ConstructorToyShop implements ToyShop {
    @Override
    public Toy createToy(int id, int weight, String name) {
        return new ConstructorToy(id, weight, name);
    }
}
