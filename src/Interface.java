import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


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
		
		Scene scene = new Scene(root);
		pStage.setScene(scene);
		pStage.setTitle("Multimedia Cours 7 - David St-Pierre ");
		pStage.show();
	}

}
