module com.example.calendarproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.calendarproject to javafx.fxml;
    exports com.example.calendarproject;
}