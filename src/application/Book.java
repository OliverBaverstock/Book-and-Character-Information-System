
package application;

/**
 * This class was developed to store information relating to a particular book
 * using its title,year of publication, publisher name, number of pages, genre,
 * plot description, and the book cover and their relevant getters and setters
 * for each instance field , this information is used by the AddBookController
 * OpenBookController and ViewBooksController
 * 
 * @author Hubert Stefański / 20081102
 * 
 */

public class Book {
	/*--------------------------------------------------------------------------
	 *                    I N S T A N C E  F I E L D S 
	 *-------------------------------------------------------------------------*/

	public Book next = null;
	
	public static Character headCharacter=null;

	private String title, author, publisher, genre, plotDescription;
	public int yearPublished, numberOfPages;

	/*--------------------------------------------------------------------------
	 *                               G E T T E R S
	 *-------------------------------------------------------------------------*/
	protected String getTitle() {
		return title;
	}

	protected String getAuthor() {
		return author;
	}

	protected int getYearPublished() {
		return yearPublished;
	}

	protected String getPublisher() {
		return publisher;
	}

	protected int getNumberOfPages() {
		return numberOfPages;
	}

	protected String getGenre() {
		return genre;
	}

	protected String getPlotDescription() {
		return plotDescription;
	}

	/*--------------------------------------------------------------------------
	*                               S E T T E R S
	*-------------------------------------------------------------------------*/

	protected void setTitle(String title) {
		this.title = title;
	}

	protected void setAuthor(String author) {
		this.author = author;
	}

	protected void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	protected void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	protected void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	protected void setGenre(String genre) {
		this.genre = genre;
	}

	protected void setPlotDescription(String plotDescription) {
		this.plotDescription = plotDescription;
	}

	public void setNext(Book nextBook) {
		this.next = nextBook;

	}
}
