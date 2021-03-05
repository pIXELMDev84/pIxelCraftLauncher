package fr.pixelm.fx;

import javafx.application.Application;
import javafx.stage.Stage;

public class FxApplication extends Application{

	private Stage stage;
	
	
	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
	}

	
	public Stage getStage() {
		return stage;
	}
	
}
