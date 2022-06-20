module com.listenndraw.androidapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.listenndraw.androidapp to javafx.fxml;
    exports com.listenndraw.androidapp;
}