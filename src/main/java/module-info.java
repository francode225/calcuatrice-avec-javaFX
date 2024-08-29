module yeofrancois.degnyalfred.calculator.calculatrice_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens yeofrancois.degnyalfred.calculator.calculatrice_fx to javafx.fxml;
    exports yeofrancois.degnyalfred.calculator.calculatrice_fx;
}