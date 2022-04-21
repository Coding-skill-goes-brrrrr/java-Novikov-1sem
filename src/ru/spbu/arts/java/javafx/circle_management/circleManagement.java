package ru.spbu.arts.java.javafx.circle_management;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class circleManagement extends Application{
    private Button button1; // первая кнопка на окне

    @Override
    public void start(Stage stage) {
        //объект Stage — это окно приложения, у него есть заголок, кнопочки,
        //содержимое
        stage.setTitle("Circle Manager");

        //Parent — узел, который можно использовать как корень для сцены
        Parent parent = initInterface();
        stage.setScene(new Scene(parent));

        //сделать видимым
        stage.show();
    }

    private Parent initInterface() {
        GridPane mainPanel = new GridPane();
        Circle circle = new Circle(1,2,3);


        Label sliderLabel = new Label("Размер круга");
        Slider sizeSlider = new Slider();
        sizeSlider.valueProperty().addListener(o -> {
            Double circleSize = sizeSlider.getValue();
            circle.setRadius(circleSize);
        });

        Label colourPicker1Label = new Label("Цвет круга");
        ColorPicker colourPicker1 = new ColorPicker();
        colourPicker1.valueProperty().addListener(o -> {
            Color circleColour = colourPicker1.getValue();
            circle.setFill(circleColour);
        });

        Label colourPicker2Label = new Label("Цвет фона");
        ColorPicker colourPicker2 = new ColorPicker();
        colourPicker2.valueProperty().addListener(o -> {
            String bgColour = colourPicker2.getStyle();
            mainPanel.setStyle(bgColour);
        });


        //добавляем панели 1, 2, 3 на grid pane
        mainPanel.add(sliderLabel, 0, 0);
        mainPanel.add(sizeSlider, 0, 1);
        mainPanel.add(colourPicker1Label, 0, 2);
        mainPanel.add(colourPicker1, 0, 3);
        mainPanel.add(colourPicker2Label, 0, 4);
        mainPanel.add(colourPicker2, 0, 5);
        mainPanel.add(circle, 1, 0,10,10);


        button1 = new Button("Не нажимай эту кнопку");
        button1.setMaxWidth(100000); //много. Нужно, чтобы кнопка тянулась
        button1.setMaxHeight(Double.MAX_VALUE); //самый большой double, который бывает

        return mainPanel;
    }

    private void initInteraction() {
        // здесь мне требуется описать поведение button1

        //1 способ. Универсальный, так можно слушателя любого события
        //указываем, события какого типа нам инетресны. Нажатие кнопки — ActionEvent
        //сравните с javascript: button1.addEventListener("click", ...)
        //и указываем реализацию интерфейса EventHandler (=слушатель)
        //такой интерфейс можно реализовать lambda-выражением
        button1.addEventHandler(ActionEvent.ACTION, event -> {
            //переменная event содержит информацию о событии.
            System.out.println("Нельзя было нажимать на эту кнопку, пожалуйста, больше не нажимайте");
            System.out.println(event.getSource()); // можно получить объект-источник события
        });

        //события мыши, бывают разные — клик, опустить кнопку, поднять кнопку, движение, наведение, уведение
        //Что бы с мышью не случилось, информация о событии - это координаты курсора, какие кнопки
        //нажаты (левая, правая)
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            System.out.println("Нажата мышь: " + mouseEvent.getButton());
        });

        button1.addEventHandler(MouseEvent.MOUSE_MOVED, mouseEvent ->
                System.out.println("мышь движется: " + mouseEvent.getX() + ", " + mouseEvent.getY())
        );

        //2. Как еще можно реагировать на нажатие кнопки
        button1.setOnAction(actionEvent -> {
            System.out.println("Кнопка нажата (2 способ добавления слушателя)");
        });
        // этот способ короче первого, но таким образом можно добавить только одного слушателя на нажатие кнопки
        // зато легко удалить слушателя: button1.setOnAction(null)
        // в первом случае удалить слушателя тоже можно, button1.removeEventHandler(... тот же объект EventHandler,
        // что и раньше.

        // про Observables:

        //button1.widthProperty() - это Observable значение ширины кнопки
        button1.widthProperty().addListener(observable ->
                System.out.println("Ширина кнопки стала " + button1.getWidth()) // или button1.widthProperty().get()
        );
        button1.widthProperty().addListener((o, oldWidth, newWidth) ->
                System.out.println("Ширина кнопки была " + oldWidth + " и стала " + newWidth)
        );

    }
}
