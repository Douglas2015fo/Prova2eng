import repository.StudentRepository;
import repository.UserRepository;
import vo.Student;
import vo.User;

public class Main {

    public static void main(String[] args) {
        StudentRepository studentRepo = new StudentRepository();
        UserRepository userRepo = new UserRepository();

        studentRepo.insert(new Student());
        userRepo.insert(new User());
    }
}
