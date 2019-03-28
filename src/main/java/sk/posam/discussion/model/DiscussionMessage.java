package sk.posam.discussion.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;

/**
 */
public class DiscussionMessage {

	private String name;
	private String description;
	private Date created;
	private Collection<DiscussionMessage> children;
	private DiscussionMessage parent;
	private DiscussionMessageType type;
	private User createdBy;
	private Course course;
	private Attachments attachments;

	/**
	 */
	public DiscussionMessage(String name, String description, User user, DiscussionMessageType type, Course course ){
		this.name = Objects.requireNonNull( name );
		this.description = description;
		this.createdBy = Objects.requireNonNull( user );
		this.type = Objects.requireNonNull( type );
		this.course = Objects.requireNonNull( course );
		this.attachments = new Attachments();
		
		this.created = new Date();
		children = new ArrayList();
	}
	
	public String getName() {
		return name;
	}

}
