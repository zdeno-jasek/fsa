package sk.posam.fsa.discussion.domain;


/**
 * Definuje typ diskusného príspevku.
 */
public enum DiscussionMessageType {
    /**
     * Otázka zadaná študentom.
     */
    QUESTION,
    /**
     * Odpoveď zadaná učiteľom.
     */
    ANSWER,
    /**
     * Akékoľvek ďalšie reakcie na odpoveď.
     */
    REPLY
}