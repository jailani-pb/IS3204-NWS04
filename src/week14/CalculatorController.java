package week14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

	@FXML Label labelInput;
	@FXML Label labelResult;

	@FXML public void showInput(ActionEvent event) {
		Button button = (Button)event.getSource();
		String previousText = labelInput.getText();
		labelInput.setText(previousText + button.getText());
	}

	@FXML public void clear() {}

	@FXML public void calculate(ActionEvent event) {}

}
