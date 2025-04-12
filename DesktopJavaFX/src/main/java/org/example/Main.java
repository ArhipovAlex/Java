package org.example;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args)
    {
        launch(args);
        //System.out.println("Hello, World!");
        //Stage - окно со всеми объектами приложения
        //- Decorated
        //- Undecorated
        //- Transparent
        //- Unified
        //- Utility
        //Вызов окна методом show();

        //Scene - отображает содержимое окна, отображает только на одном Stage
        //NodeGraph - древовидная структура, сод. все элементы сцены (ноды)

        //Nodes:
        //- 2D/3D shapes;
        //- элементы управления: button, checkbox...
        //- контейнеры: BorderPane, GridPane...
        //- Media elements: images, audio, video

        //NootNode - включают все элементы окнаж
        //Branch node/Parent node:
        // - group;
        // - region;
        // - WebView;

        //LeafNodes - узлы без дочерних элементов
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}