package sk.posam.fsa.discussion.domain;

import java.util.Date;

/**
 * Evidencia označených správnych odpovedí k danej otázke.
 */
public class CorrectAnswer {

    private Long id;

    private Date created;
    private DiscussionMessage answer;
    private DiscussionMessage question;
    private User user;

    public CorrectAnswer() {
        // Prázdny konštruktor
    }

    // Gettery a settery pre atribúty triedy

}