module dk.easv.wow.gitstuff {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.wow.gitstuff to javafx.fxml;
    exports dk.easv.wow.gitstuff;
}