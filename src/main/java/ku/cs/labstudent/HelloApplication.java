package ku.cs.labstudent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        configRoutes();
        FXRouter.bind(this,stage,"Hello World!");
        FXRouter.goTo("hello");
    }

    private  void configRoutes(){
        String viewPath = "ku/cs/views";
        FXRouter.when("hello",viewPath +"/hello-view.fxml");
        FXRouter.when("student-profile",viewPath+"/student.fxml");
        FXRouter.when("student-list",viewPath+"/student-list.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}