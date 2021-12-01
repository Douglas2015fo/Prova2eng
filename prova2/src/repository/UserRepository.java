package repository;

import configuration.DatabaseConfiguration;
import vo.User;

public class UserRepository {

    private DatabaseConfiguration databaseConfiguration;

    public UserRepository() {
        databaseConfiguration = DatabaseConfiguration.getInstance();
    }

    public void insert(User user) {
        //proceed with insert object in database
    }
}
