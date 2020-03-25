/*
Name: Meghan Fitzgerald
Date: 25/03/2020
Contact: G00335180@gmit.ie
Comments: Design Principles lab where we explored how to use 2 of the SOLID Principles, Single and Open.
 */

package ie.gmit.single;

import java.util.HashMap;
import java.util.Map;

//Stores data in memory
public class Store {

    private static final Map<String, User> STORAGE = new HashMap<>();

    public void store(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }

    public User getUser(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }
}