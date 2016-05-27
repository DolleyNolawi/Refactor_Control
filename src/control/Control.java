package control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Model;

public class Control {
	Model model = new Model();
	//when the print button is clicked

	public void printHandler(ActionEvent event , String data) {
			model.print(data);
	}
	
	public void clearHandler(ActionEvent event){	
		model.clear();
	}

}
