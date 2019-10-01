package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewBooksController {
	@FXML
	private Button openBookButton, deleteBookButton, returnButton;
	@FXML
	private CheckBox alphaCheckBox;
	@FXML
	private ChoiceBox<String> viewBooksPicker;

	@FXML
	public void openBook(ActionEvent e) {

	}

	@FXML
	public void deleteBook(ActionEvent e) {

	}

	@FXML
	public void returnPage(ActionEvent e) {

		Stage s = (Stage) returnButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public void initialize() {

		Book temp = Main.head;
		while (temp != null) {
			viewBooksPicker.getItems().add("Title: " + temp.getTitle());

			temp = temp.next;
		}

	}
}