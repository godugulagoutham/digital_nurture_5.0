public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean register(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        if (userRepository.existsByEmail(email)) {
            return false;
        }
        userRepository.save(email);
        return true;
    }
}
