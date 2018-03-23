package sk.posam.discussion.model;

import java.util.Collection;

/**
 */
public interface DiscussionMessageRepository {

	public Collection<DiscussionMessage> readByCourse(Course course);

}