package sk.posam.fsa.discussion.domain;

import java.util.Collection;

public interface CourseRepository {

	public Collection<Course> findByUser(User user);

	public Collection<Course> readAll();

	public void create(Course course);

}