package sk.posam.discussion.api;

import java.util.Collection;

/**
 */
public interface CourseApi {

	/**
	 */
	Collection<DTOCourse> getList(long userId);

	/**
	 */
	void createCourse(String courseName, long userId);

}