package application;

import javafx.application.Platform;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainMenuController {

	@FXML Button addBookButton, addCharacterButton, viewBooksButton,
	viewCharactersButton, exitButton, button;

	//Changes the scene to the Add Book scene when the add book button is pressed.
	@FXML public void addBook(ActionEvent e) {

		Stage s=(Stage) addBookButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("AddBook.fxml"));


			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	@FXML public void addCharacter(ActionEvent e) {

		Stage s=(Stage) addBookButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("AddCharacter.fxml"));


			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	@FXML public void viewBooks(ActionEvent e) {

		Stage s=(Stage) addBookButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("ViewBooks.fxml"));


			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	@FXML public void viewCharacters(ActionEvent e) {

		Stage s=(Stage) addBookButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("ViewCharacters.fxml"));


			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	//This exits the program when the exit button is pressed
	@FXML public void exit(ActionEvent e) {

		Platform.exit();

	}

}


