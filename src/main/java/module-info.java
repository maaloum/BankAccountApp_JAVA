module com.bankingapplication.bankingapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bankingapplication.bankingapplication to javafx.fxml;
    exports com.bankingapplication.bankingapplication;
}