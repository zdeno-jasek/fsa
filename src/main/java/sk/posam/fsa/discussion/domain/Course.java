package sk.posam.fsa.discussion.domain;

/**
 * Definícia predmetu, ktorý vyučuje učiteľ.
 * Zodpovednosť tejto triedy je poskytovať popis predmetu.
 */
public class Course {

    private long id;
    private String description;
    private User assigned;

    public Course() {
        // Prázdny konštruktor
    }

    // Gettery a settery pre atribúty triedy


    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public User getAssigned() {
        return assigned;
    }
}