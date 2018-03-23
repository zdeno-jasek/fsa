package sk.posam.discussion.api;

import java.util.Collection;
import java.util.List;

/**
 */
public interface DiscussionApi {

	/**
	 */
	void createQuestion(DTOCourse course, String name, String desciption, DTOUser user);

	/**
	 * 
	 * @param course
	 */
	Collection<DTOQuestion> getLastQuestions(DTOCourse course);

	/**
	 * 
	 * @param topicId
	 * @param lineFrom
	 * @param lineTo
	 */
	List<DTOMessageTree> getMessagesExpanded(long topicId, int lineFrom, int lineTo);

}