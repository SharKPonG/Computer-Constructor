module ku.cs {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.labstudent to javafx.fxml;
    exports ku.cs.labstudent;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}