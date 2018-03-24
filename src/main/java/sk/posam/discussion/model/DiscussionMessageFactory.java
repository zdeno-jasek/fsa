package sk.posam.discussion.model;

import sk.posam.discussion.model.DiscussionMessageFactoryTest.NotifikaciaTest;

/**
 */
public final class DiscussionMessageFactory {

	/**
	 */
	public static DiscussionMessage create(String name, String description, User user, DiscussionMessageType type, Course course, Notification notifikacia ){
		return new DiscussionMessage(name, description, user, type, course);
	}

	private DiscussionMessageFactory(){
	}

	public static DiscussionMessage createQuestion(String name, String description, User user, Course course,
			NotifikaciaTest notifikacia) {
		return create(name, description, user, DiscussionMessageType.QUESTION, course, notifikacia);
	}

	public static DiscussionMessage createAnswer(DiscussionMessage otazka, String name, String description, User user,
			Course course, NotifikaciaTest notifikacia) {
		DiscussionMessage answer = create(name, description, user, DiscussionMessageType.ANSWER, course, notifikacia);
		otazka.addChild(answer);
		
		return answer;
	}

}