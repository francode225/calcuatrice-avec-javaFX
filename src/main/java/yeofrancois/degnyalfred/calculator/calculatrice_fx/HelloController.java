package yeofrancois.degnyalfred.calculator.calculatrice_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private TextField ecran;

    @FXML
    private Text text_du_haut;

    private String nombre1 = "";

    private String nombre_courant = "";

    private String operateur;

    @FXML
    void additionAction(ActionEvent event) {
        choix_operateur("+");
    }

    @FXML
    void soustractionAction(ActionEvent event) {
        choix_operateur("-");
    }

    @FXML
    void divisionAction(ActionEvent event) {
        choix_operateur("/");
    }

    @FXML
    void multiplicationAction(ActionEvent event) {
        choix_operateur("*");
    }

    @FXML
    void moduloAction(ActionEvent event) {
        choix_operateur("%");
    }

    public void choix_operateur(String operateur){
        this.operateur = operateur;
        nombre1 = nombre_courant;
        nombre_courant = "";
        text_du_haut.setText(nombre1 + " " + operateur);
    }

    @FXML
    void calculer(ActionEvent event) {
        int nombre1Int = Integer.parseInt(nombre1);
        int nombre2Int = Integer.parseInt(nombre_courant);

        switch (operateur) {
            case "+" -> {
                int calculer_nombre = nombre1Int + nombre2Int;
                text_du_haut.setText(nombre1 + " + " + nombre_courant + " = " + calculer_nombre);
                ecran.setText(String.valueOf(calculer_nombre));
            }
            case "-" -> {
                int calculer_nombre = nombre1Int - nombre2Int;
                text_du_haut.setText(nombre1 + " - " + nombre_courant + " = " + calculer_nombre);
                ecran.setText(String.valueOf(calculer_nombre));
                nombre_courant = String.valueOf(calculer_nombre);
            }
            case "/" -> {

                int calculer_nombre = nombre1Int / nombre2Int;
                text_du_haut.setText(nombre1 + " / " + nombre_courant + " = " + calculer_nombre);
                ecran.setText(String.valueOf(calculer_nombre));
                nombre_courant = String.valueOf(calculer_nombre);
            }
            case "*" -> {
                int calculer_nombre = nombre1Int * nombre2Int;
                text_du_haut.setText(nombre1 + " * " + nombre_courant + " = " + calculer_nombre);
                ecran.setText(String.valueOf(calculer_nombre));
                nombre_courant = String.valueOf(calculer_nombre);
            }
            case "%" -> {
                int calculer_nombre = nombre1Int % nombre2Int;
                text_du_haut.setText(nombre1 + " mod " + nombre_courant + " = " + calculer_nombre);
                ecran.setText(String.valueOf(calculer_nombre));
                nombre_courant = String.valueOf(calculer_nombre);
            }
        }
    }

    @FXML
    void viderAction(ActionEvent event) {
        nombre_courant = "";
        ecran.setText("");
        text_du_haut.setText("");
    }

    @FXML
    void click_chiffre0(ActionEvent event) {
        if (!nombre_courant.equals("0")) {
            ajouter_chiffre("0");
        }
    }

    @FXML
    void negationAction(ActionEvent event) {
        if (!nombre_courant.isEmpty()) {
            int nombreCourantInt = Integer.parseInt(nombre_courant);
            nombreCourantInt *= -1;
            nombre_courant = String.valueOf(nombreCourantInt);
            modifier_ecran();
        }
    }

    @FXML
    void effacerAction(ActionEvent event) {
        String texteDuHaut = text_du_haut.getText();
        if (!texteDuHaut.isEmpty()) {
            String dernierCaractere = texteDuHaut.substring(texteDuHaut.length() - 1);
            if (dernierCaractere.equals(" ")) {
                texteDuHaut = texteDuHaut.substring(0, texteDuHaut.length() - 2);
            } else {
                texteDuHaut = texteDuHaut.substring(0, texteDuHaut.length() - 1);
            }
            text_du_haut.setText(texteDuHaut);
        }
    }



    @FXML
    void click_chiffre1(ActionEvent event) {
        ajouter_chiffre("1");
    }

    @FXML
    void click_chiffre2(ActionEvent event) {
        ajouter_chiffre("2");
    }

    @FXML
    void click_chiffre3(ActionEvent event) {
        ajouter_chiffre("3");
    }

    @FXML
    void click_chiffre4(ActionEvent event) {
        ajouter_chiffre("4");
    }

    @FXML
    void click_chiffre5(ActionEvent event) {
        ajouter_chiffre("5");
    }

    @FXML
    void click_chiffre6(ActionEvent event) {
        ajouter_chiffre("6");
    }

    @FXML
    void click_chiffre7(ActionEvent event) {
        ajouter_chiffre("7");
    }

    @FXML
    void click_chiffre8(ActionEvent event) {
        ajouter_chiffre("8");
    }

    @FXML
    void click_chiffre9(ActionEvent event) {
        ajouter_chiffre("9");
    }

    /*@FXML
    void click_virgule(ActionEvent event) {
        ajouter_chiffre(".");
    }*/

    public void modifier_ecran(){
        ecran.setText(nombre_courant);
    }

    public void ajouter_chiffre(String number){
        nombre_courant += number;
        modifier_ecran();
    }

}