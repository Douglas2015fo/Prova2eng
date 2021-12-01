package repository;

import configuration.DatabaseConfiguration;
import vo.Student;

public class StudentRepository {
    private DatabaseConfiguration databaseConfiguration;

    public StudentRepository() {
        databaseConfiguration = DatabaseConfiguration.getInstance();
    }

    public void insert(Student student) {
        //proceed with insert object in database
    }
}
