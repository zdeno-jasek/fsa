package sk.posam.discussion.api;

import java.util.Date;
import java.util.List;

/**
 */
public final class DTOMessageTree {

	public long id;
	public String subject;
	public String description;
	public Date created;
	public long createdBy;
	public Date updated;
	public long updatedBy;
	public int liked;
	public int disliked;
	public List<DTOMessageTree> reactions;


}