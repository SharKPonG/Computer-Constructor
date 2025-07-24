package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;
import ku.cs.services.FXRouter;

import java.io.IOException;

//ku.cs.controllers.StudentController
public class StudentController {
    @FXML
    private Label nameLabel;

    @FXML
    private Label scoreLabel;

    @FXML
    public void initialize(){
        Student student = new Student("6710456789","John S.Watson");
        student.setScore(60.5);
        showStudent(student);

    }

    private void showStudent(Student student){
        nameLabel.setText(student.getName());
        scoreLabel.setText(String.format("%.2f",student.getScore()));
    }

    @FXML
    protected void onBackButtonClick(){
        try {
            FXRouter.goTo("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
