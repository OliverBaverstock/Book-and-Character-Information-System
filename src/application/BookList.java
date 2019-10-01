package application;

public class BookList {
	Book head;
	Book tail;

	public void AddBook(String title, String author, int yearPublished, String publisher, int numberOfPages,
			String genre, String plotDescription) {
		Book newBook = new Book();

		if (tail == null) {
			head = newBook;
			tail = newBook;
		} else {
			tail.setNext(newBook);
			tail = newBook;
		}
	}

	public Book findBookByTitle(String title) {
		if (head == null) {
			return null;
		}
		if (head.getTitle().equals(title)) {
			return head;
		}
		Book active = head;

		while (active.next != null) {
			if (active.getTitle().equals(title)) {
				return active;
			}
			active = active.next;
		}
		return null;
	}

	public Book findBookByAuthor(String author) {
		if (head == null) {
			return null;
		}
		if (head.getAuthor().equals(author)) {
			return head;
		}
		Book active = head;

		while (active.next != null) {
			if (active.getAuthor().equals(author)) {
				return active;
			}
			active = active.next;
		}
		return null;
	}

	public Book findBookByGenre(String genre) {
		if (head == null) {
			return null;
		}
		if (head.getTitle().equals(genre)) {
			return head;
		}
		Book active = head;

		while (active.next != null) {
			if (active.getTitle().equals(genre)) {
				return active;
			}
			active = active.next;
		}
		return null;
	}

}
