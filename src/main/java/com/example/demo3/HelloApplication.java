package com.example.demo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * La clase HelloApplication es donde se van a encontar cada parte de la interfaz gráfica
 * tal es el caso de los Labels, Buttom, el escenario y ChoiseBox
 */
public class HelloApplication extends Application {
    @Override

    public void start(Stage stage) throws IOException {
        /**
         *Se encuentran los Labels, choiceBox y buttom de la interfaz grafica
         */
        //Label del nombre
        Label nombreLabel=new Label("Nombre: ");

        //Label del persona 1
        Label persona_1Label=new Label("Persona 1");

        //Label del persona 2
        Label persona_2Label=new Label("Persona 2");

        //Entrada de texto del nombre
        TextField nombreText=new TextField();

        //Label para la edad
        Label dobLabel=new Label("Edad: ");

        //Entrada de la edad
        TextField edadText=new TextField();

        //Label de la provincia
        Label provinciaLabel=new Label("Provincia :");

        //Choice Box de las provincias
        ChoiceBox provinciaChoiceBox=new ChoiceBox();
        provinciaChoiceBox.getItems().addAll(
                "Alajuela","San José","Puntarenas","Cartago",
                "Heredia","Guanacaste","Limón"
        );

        //Choice Box de las personas1
        ChoiceBox personas_1ChoiceBox=new ChoiceBox();
        personas_1ChoiceBox.getItems().addAll();

        //Choice Box de las personas1
        ChoiceBox personas_2ChoiceBox=new ChoiceBox();
        personas_2ChoiceBox.getItems().addAll();

        //Botón de añadir persona
        Button añadir_personaButton=new Button("+ Persona");

        //Botón de sumar
        Button sumarButton=new Button("+");

        //Botón de restar
        Button restarButton=new Button("-");

        //Botón de sumar
        Button dividirButton=new Button("/");

        //Botón de sumar
        Button multiplicatButton=new Button("*");

        //Programar botnones
        añadir_personaButton.setOnAction(e-> getInformation(nombreText,edadText,provinciaChoiceBox));

        /**
         * Creación del panel y colacación de los objetos
         * en la interfaz
         */
        //Crear Panel
        GridPane panelGridPane=new GridPane();

        //Dimenciones del panel
        panelGridPane.setMinSize(400,300);

        //Borde del panel
        panelGridPane.setPadding(new Insets(10,10,10,10));

        //Espacio entre columnas y filas
        panelGridPane.setVgap(5);
        panelGridPane.setHgap(5);

        //Alineamiento del panel
        panelGridPane.setAlignment(Pos.TOP_LEFT);

        //Colocar los Labels, botones y demás en el panel
        panelGridPane.add(nombreLabel,0,17);
        panelGridPane.add(nombreText,1,17);

        panelGridPane.add(persona_1Label,10,17);
        panelGridPane.add(persona_2Label,10,19);

        panelGridPane.add(personas_1ChoiceBox,10,18);
        panelGridPane.add(personas_2ChoiceBox,10,20);

        panelGridPane.add(provinciaLabel,0,18);
        panelGridPane.add(provinciaChoiceBox,1,18);

        panelGridPane.add(dobLabel,0,19);
        panelGridPane.add(edadText,1,19);

        panelGridPane.add(añadir_personaButton,1,20);

        panelGridPane.add(sumarButton,9,21);
        panelGridPane.add(restarButton,11,21);
        panelGridPane.add(multiplicatButton,9,22);
        panelGridPane.add(dividirButton,11,22);

        //Fondo del panel
        panelGridPane.setStyle("-fx-background-color:BEIGE;");

        //Crear el objeto escena
        Scene scene=new Scene(panelGridPane);

        //Título del escenario
        stage.setTitle("Calculadora de personas");

        //Se añade la escena al escenario
        stage.setScene(scene);

        //Se muestran el contenido en pantalla
        stage.show();
    }

    /**
     * Aquí se configura el botón con el cual se agrega a la persona
     * utilizando los siguientes parametros para guardar la información de la
     * persona
     * @param nombreText Guarda el nombre completo de la persona
     * @param edadText Recolecta la edad de la persona en años cumplidos
     * @param provinciaChoiceBox Guarda el lugar de procedencia de la persona
     */
    private void getInformation(TextField nombreText, TextField edadText, ChoiceBox provinciaChoiceBox) {
        

        //Obtener los valores de la persona
        String nombres = nombreText.getText();
        int edades = Integer.parseInt(edadText.getText());
        String localidades = (String) provinciaChoiceBox.getValue();

        //Limpiar los textField
        nombreText.clear();
        edadText.clear();

        //Recorrer la lista de nombres

        List<String> nombresLista = new ArrayList<String>();
        nombresLista.add(nombresLista.size(),nombres);
        System.out.println(nombresLista);

        //Edades lista
        List<Integer> edadesLista = new ArrayList<Integer>();
        edadesLista.add(edadesLista.size(),edades);
        System.out.println(edadesLista);

        //Localidades lista
        List<String> localidadesLista = new ArrayList<String>();
        localidadesLista.add(localidadesLista.size(),localidades);
        System.out.println(localidadesLista);


        /**
         * imprimir en consolo los valores de la persona
         * para de ese modo confirmar que lo estamos haciendo bien
         */
        System.out.println(nombres);
        System.out.println(edades);
        System.out.println(localidades);
        //System.out.println(edadList);
        System.out.println("\n");


    }

    public static void main(String[] args) {
        launch(args);
    }
}