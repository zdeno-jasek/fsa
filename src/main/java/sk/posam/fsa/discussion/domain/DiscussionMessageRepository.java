package sk.posam.fsa.discussion.domain;

import java.util.Collection;

public interface DiscussionMessageRepository {

    Collection<DiscussionMessage> findByCourse(Course course);

    Collection<DiscussionMessage> findByUser(User user);

    Collection<DiscussionMessage> findAll();

    void create(DiscussionMessage discussionMessage);

    void update(DiscussionMessage discussionMessage);

}