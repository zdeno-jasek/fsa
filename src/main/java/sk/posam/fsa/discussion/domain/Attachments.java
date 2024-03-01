package sk.posam.fsa.discussion.domain;

/**
 * Zoznam príloh k diskusnému príspevku.
 * Zodpovednosť tejto triedy je overovať, či daná príloha spĺňa technické požiadavky, t.j.
 * či je správneho typu a jej obsah nepresahuje stanovený limit. Trieda obmedzuje
 * aj maximálny počet príloh k jednému príspevku.
 */
public class Attachments {

    /**
     * Unikátny identifikátor prílohy.
     */
    private long id;

    /**
     * Zoznam príloh, ktoré sú priradené k tomuto zoznamu príloh.
     */
    private Attachment[] attachments;

    /**
     * Konštruktor pre triedu Attachments.
     */
    public Attachments() {
        // Prázdny konštruktor
    }

    /**
     * Pridá prílohu k zoznamu príloh.
     *
     * @param attachment Príloha, ktorú chcete pridať.
     */
    public void add(Attachment attachment) {
        // Implementácia pridania prílohy k zoznamu príloh
    }

    /**
     * Odstráni prílohu zoznamu príloh na základe jej identifikátora.
     *
     * @param attachmentId Identifikátor prílohy, ktorú chcete odstrániť.
     */
    public void remove(long attachmentId) {
        // Implementácia odstránenia prílohy z zoznamu príloh na základe identifikátora
    }
}
