package ru.spbu.arts.java.javafx.messenger;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;


public class Messenger extends Application{

    @Override
    public void start(Stage stage) {
        //объект Stage — это окно приложения, у него есть заголок, кнопочки,
        //содержимое
        stage.setTitle("Фейсбук");

        //Parent — узел, который можно использовать как корень для сцены
        Parent parent = initInterface();
        stage.setScene(new Scene(parent));

        //сделать видимым
        stage.show();
    }

    private Parent initInterface() {
        HBox messengerWindow = new HBox();
        HBox textFieldAndButton = new HBox();
        VBox TFandBandTextArea = new VBox();
        VBox labelAndListView = new VBox();

        TextArea messages = new TextArea();
        messages.setPrefHeight(385);
        HBox.setHgrow(messages, Priority.ALWAYS);
        TextField messageWrite = new TextField();
        HBox.setHgrow(messageWrite, Priority.ALWAYS);
        Button sendMessage = new Button("Отправить");
        sendMessage.setMinWidth(80);
        sendMessage.setPrefWidth(80);
        Label contactList = new Label("Список Контактов");
        ListView contacts = new ListView();

        textFieldAndButton.getChildren().addAll(messageWrite, sendMessage);
        TFandBandTextArea.getChildren().addAll(messages, textFieldAndButton);
        labelAndListView.getChildren().addAll(contactList, contacts);
        labelAndListView.setPrefWidth(250);
        HBox.setHgrow(labelAndListView, Priority.ALWAYS);
        messengerWindow.getChildren().addAll(TFandBandTextArea, labelAndListView);
        HBox.setHgrow(messengerWindow, Priority.ALWAYS);
        return messengerWindow;
    }
}
