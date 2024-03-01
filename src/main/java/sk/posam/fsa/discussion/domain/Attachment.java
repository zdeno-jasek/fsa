package sk.posam.fsa.discussion.domain;

/**
 * Trieda predstavuje prílohu k diskusnému príspevku.
 * Zodpovednosť tejto triedy je uchovávať obsah samotnej prílohy, jej názov a typ.
 */
public class Attachment {

	/**
	 * Unikátny identifikátor prílohy.
	 */
	private long id;

	/**
	 * Názov prílohy.
	 */
	private String name;

	/**
	 * Typ prílohy.
	 * (Tu môžete pridať bližšie informácie o tom, aké hodnoty môže atribút 'type' nadobúdať.)
	 */
	private int type;

	/**
	 * Obsah prílohy vo forme bajtového poľa.
	 */
	//private byte[] content;

	/**
	 * Konštruktor pre triedu Attachment.
	 */
	public Attachment() {
		// Prázdny konštruktor
	}
}