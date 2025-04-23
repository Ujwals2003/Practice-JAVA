package gymaccess;

import gym.Gym;

public class Manager {
    public void manage() {
        // Create Gym instance
        Gym gym = new Gym();

        System.out.println("Name: " + gym.getName());
    }
}
