package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * This class was developed to enable the user to add/remove and edit the books
 * and their details trough a javaFX graphical user interface taking in instance
 * fields from the book class
 * 
 * @author Hubert Stefański / 20081102
 * 
 */
public class AddBookController {
	@FXML
	private Button addBookButton, returnButton;
	@FXML
	private TextField titleField, authorField, yearPublishedField, publisherField, numberOfPagesField;
	@FXML
	private ChoiceBox<String> genrePicker;
	@FXML
	private TextArea plotDescriptionArea;

//This method adds a new book to the book file, providing all the fields are filled out
	@FXML
	public void addBook(ActionEvent e) {
		String title = titleField.getText();
		String author = authorField.getText();
		int yearPublished = Integer.parseInt(yearPublishedField.getText());
		String publisher = publisherField.getText();
		int numberOfPages = Integer.parseInt(numberOfPagesField.getText());
		String genre = genrePicker.getValue();
		String plotDescription = plotDescriptionArea.getText();

		// linked list to be used here?
		Book nb = new Book();
		nb.setTitle(title);
		nb.setAuthor(author);
		nb.setYearPublished(yearPublished);
		nb.setPublisher(publisher);
		nb.setNumberOfPages(numberOfPages);
		nb.setGenre(genre);
		nb.setPlotDescription(plotDescription);

		nb.next = Main.head;
		Main.head = nb;

		Book active = Main.head;

		Stage s = (Stage) returnButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("BookAdded.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

	// this method returns the user to the main menu when it is run
	@FXML
	public void returnPage(ActionEvent e) {

		Stage s = (Stage) addBookButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

//responsible for adding 
	public void initialize() {

		genrePicker.getItems().addAll("Horror", "Thriller", "Hentai",
				"Tragedy", "Science fiction", "Fantasy", "Mythology",
				"Adventure", "Mystery", "Drama", "Romance");

	}

}
