package sk.posam.fsa.discussion.domain;

public interface UserRepository {

    User get(long id);

    User get(String email);

    void create(User user);
}
