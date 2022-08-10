module controlador.prueba01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens controlador to javafx.fxml;
    exports controlador;
}