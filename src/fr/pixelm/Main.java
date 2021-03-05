package fr.pixelm;

import fr.arinonia.arilibfx.AriLibFX;
import fr.pixelm.fx.FxApplication;
import javafx.application.Application;

public class Main {
	
	public static void main(String[] args) {
		AriLibFX.setProgramName("pixelCraft");
		AriLibFX.setResourcePath("/fr/pixelm/resources");
		Application.launch(FxApplication.class, args);
	}
	
	
}
