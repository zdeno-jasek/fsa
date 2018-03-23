package sk.posam.discussion.model;

import java.util.Date;

/**
 */
public class DiscussionMessage {

	private String name;
	private String description;
	private Date created;
	private DiscussionMessage childs;
	private DiscussionMessageType type;
	private User createdBy;
	private Course course;
	private Attachments attachments;

	/**
	 */
	public DiscussionMessage(String name, String description, User user, Notification notification){

	}

}