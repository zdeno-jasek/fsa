package sk.posam.discussion.application;

import java.util.Collection;
import java.util.List;

import sk.posam.discussion.api.DTOCourse;
import sk.posam.discussion.api.DTOMessageTree;
import sk.posam.discussion.api.DTOQuestion;
import sk.posam.discussion.api.DTOUser;
import sk.posam.discussion.api.DiscussionApi;

/**
 */
public final class DiscussionApiService implements DiscussionApi {

	public void createQuestion(DTOCourse course, String name, String desciption, DTOUser user) {
		// TODO Auto-generated method stub
		
	}

	public Collection<DTOQuestion> getLastQuestions(DTOCourse course) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DTOMessageTree> getMessagesExpanded(long topicId, int lineFrom, int lineTo) {
		// TODO Auto-generated method stub
		return null;
	}


}