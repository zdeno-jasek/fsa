package sk.posam.discussion.model;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DiscussionMessageFactoryTest {
	
	private String name;
	private String description;
	private User user;
	private DiscussionMessageType type;
	private NotifikaciaTest notifikacia;
	private Course course;

	@Before
	public void setup() {
		name = "nazov";
		description = "popis";
		user = new User();
		type = DiscussionMessageType.ANSWER;
		notifikacia = new NotifikaciaTest();
		course = new Course();
		
	}
	
	@Test
	public void createVytvoriNovyObjektAPosleNotifikaciu() {
		DiscussionMessage novyObjekt = DiscussionMessageFactory.create(name , description, user, type, course, notifikacia );
		assertNotNull( novyObjekt );
		//assertTrue( notifikacia.isBolaZavolana() );
	}
	
	@Test
	@Ignore
	public void createVytvoriDiscussionMessageSoSpravnymNazvom() {
		DiscussionMessage novyObjekt = DiscussionMessageFactory.create(name , description, user, type, course, notifikacia );
		assertNotNull( novyObjekt );
		assertEquals( name, novyObjekt.getName() );
	}
	
	@Test
	public void createKOtazkeSaPripojiOdpoved() {
		DiscussionMessage otazka = DiscussionMessageFactory.createQuestion(name , description, user, course, notifikacia );
		DiscussionMessage odpoved = DiscussionMessageFactory.createAnswer( otazka, name , description, user, course, notifikacia );
		DiscussionMessage odpoved2 = DiscussionMessageFactory.createAnswer( otazka, name , description, user, course, notifikacia );

		assertNotNull( otazka );
		assertNotNull( odpoved );
		
		Iterator<DiscussionMessage> it = otazka.getChildren().iterator();
		assertEquals( it.next(), odpoved );
		assertEquals( it.next(), odpoved2 );
		assertEquals( odpoved.getParent(), otazka );
		
	}
	
	class NotifikaciaTest implements Notification {
		private boolean bolaZavolana = false;

		public void notify(User pouzivatel) {
			bolaZavolana = true;
		}

		boolean isBolaZavolana() {
			return bolaZavolana;
		}
		
	}

}
