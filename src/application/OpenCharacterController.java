package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * @author Niall Jordan / 20079783
 *
 */

public class OpenCharacterController {

	@FXML private ChoiceBox <String> viewCharactersPicker;
	@FXML private Button returnButton, deleteCharacterButton, openCharacterButton;
	@FXML private CheckBox alphaCheckBox;

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
		Character temp1 = Main.headCharacter;
	}
}
