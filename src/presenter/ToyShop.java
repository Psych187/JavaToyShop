package presenter;

import model.Toy;

public interface ToyShop {
    Toy createToy(int id, int weight, String name);
}
