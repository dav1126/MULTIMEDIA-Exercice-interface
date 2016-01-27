import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Interface extends Application
{

	public static void main(String[] args)
	{		
			Application.launch(args);		
	}
	
	public void start(Stage pStage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("interface.fxml"));
		Pane root = (Pane) loader.load();
		FXMLController mainController = (FXMLController)loader.getController();
		//mainController.setStartController(this);
			
		Scene scene = new Scene(root);
		pStage.setScene(scene);
		pStage.setTitle("Multimedia Cours 7 - David St-Pierre ");
		pStage.show();
		
		//Responsivity: Bind the image size with its container size
    	//Get the window
    	//mainController.dragImgView.fitHeightProperty().bind(pStage.heightProperty());
    	//mainController.dragImgView.fitWidthProperty().bind(pStage.widthProperty().multiply(1/4));
	}

}
