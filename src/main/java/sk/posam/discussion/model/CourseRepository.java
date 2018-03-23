package sk.posam.discussion.model;

import java.util.Collection;

/**
 */
public interface CourseRepository {

	Collection<Course> readByUser(User user);

}