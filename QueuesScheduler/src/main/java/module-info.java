module com.example.pt2022_30221_linaru_petra_assignment_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.pt2022_30221_linaru_petra_assignment_2 to javafx.fxml;
    exports com.example.pt2022_30221_linaru_petra_assignment_2;
}