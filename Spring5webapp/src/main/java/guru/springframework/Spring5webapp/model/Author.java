package guru.springframework.Spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Rays
 *
 */
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	String firstName;
	String lastNAME;
	@ManyToMany
	Set<Book> books = new HashSet<>();

	public Author(String firstName, String lastNAME) {
		super();
		this.firstName = firstName;
		this.lastNAME = lastNAME;
	}

	public Author(String firstName, String lastNAME, Set<Book> books) {
		super();
		this.firstName = firstName;
		this.lastNAME = lastNAME;
		this.books = books;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNAME() {
		return lastNAME;
	}

	public void setLastNAME(String lastNAME) {
		this.lastNAME = lastNAME;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
