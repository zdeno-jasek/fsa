package sk.posam.fsa.discussion.domain;


import java.util.Collection;
import java.util.Date;

/**
 * Definícia: Text zadaný učiteľom alebo študentom, ktorý sa vzťahuje k práve
 * jednému vybranému predmetu.
 * Zodpovednosť:
 * Diskusný príspevok riadi zoznam reakcií na neho (udržuje ich konzistentný).
 */
public class DiscussionMessage {

    private Long id;
    private String name;
    private String message;
    private Date created;
    private Attachments attachments;
    private DiscussionMessage children;
    private DiscussionMessageType typ;
    private User createdBy;
    private Course course;

}