package com.mycompany.horasextras;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{
    @FXML private TextField txtBase;
    @FXML private TextField txtHorasExtra;
    @FXML private TextField txtPagoExtra;
    @FXML private TextField txtSubtotal;
    @FXML private TextField txtIsr;
    @FXML private TextField txtNeto;

    double base = 9000;
    int horasExtra = 0;
    double pagoExtra = 120;

    @FXML
    private void switchToSecondary() throws IOException {
        horasExtra = Integer.parseInt(txtHorasExtra.getText());
        double sueldoExtra = horasExtra * pagoExtra;
        double subtotal = base + sueldoExtra;
        double isr = subtotal * 0.16;
        double neto = subtotal - isr;

        txtPagoExtra.setText(""+sueldoExtra);
        txtSubtotal.setText(""+subtotal);
        txtIsr.setText(""+isr);
        txtNeto.setText(""+neto);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtBase.setText(base+"");
    }
}
