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
 * This class was developed to 
 * 
 * @author Niall Jordan/20079783
 *
 */

public class AddCharacterController {
	@FXML private TextField characterNameField;
	@FXML private ChoiceBox <String> genderPicker;
	@FXML private ChoiceBox <String> bookAssociatedPicker; 
	@FXML private TextArea characterDescriptionArea;
	@FXML private Button returnButton, addCharacterButton;

	@FXML public void addCharacter(ActionEvent e) {

		String characterName = characterNameField.getText();
		String gender = genderPicker.getValue();
		String characterDescription = characterDescriptionArea.getText();
		String bookAssociated = bookAssociatedPicker.getValue();

		//HASH LISTS
		Character nc = new Character();
		nc.setCharacterName(characterName);
		nc.setGender(gender);
		nc.setCharacterDescription(characterDescription);
		nc.setBookAssociated(bookAssociated);

		nc.next = Main.headCharacter;
		Main.headCharacter = nc;

		Character active = Main.headCharacter;

		//

		Stage s=(Stage) returnButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("CharacterAdded.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	@FXML public void returnPage(ActionEvent e) {

		Stage s=(Stage) returnButton.getScene().getWindow();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
		} catch(Exception e2) {
			e2.printStackTrace();
		}
	}

	public void initialize() {
		Book temp = Main.head;
		while (temp != null) {
			bookAssociatedPicker.getItems().add("Title: " + temp.getTitle());
			genderPicker.getItems().addAll("Male", "Female");

			temp = temp.next;
		}
	}

}
