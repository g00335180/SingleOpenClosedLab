/*
Name: Meghan Fitzgerald
Date: 25/03/2020
Contact: G00335180@gmit.ie
Comments: Design Principles lab where we explored how to use 2 of the SOLID Principles, Single and Open.
 */

package ie.gmit.single;

public class UserPersistenceService {
    private Store store = new Store();

    public void saveUser(User user)
    {
        store.store(user);
    }
}
