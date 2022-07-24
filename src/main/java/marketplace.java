import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class marketplace extends Application {
    @Override
    public void start(Stage stage) {
        Text text1 = new Text("List of 3 products:");
        text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));
        text1.setX(10);
        text1.setY(15);

        Text text2 = new Text("1. 7522, Gaming mouse, 45$");
        text2.setFont(Font.font("verdana", FontPosture.REGULAR, 12));
        text2.setX(10);
        text2.setY(30);

        Text text3 = new Text("2. 1631, Keyboard, 12$");
        text3.setFont(Font.font("verdana", FontPosture.REGULAR, 12));
        text3.setX(10);
        text3.setY(45);

        Text text4 = new Text("3. 4566, Laptop Lenovo, 410$");
        text4.setFont(Font.font("verdana", FontPosture.REGULAR, 12));
        text4.setX(10);
        text4.setY(60);

        Text text5 = new Text("List of all users:");
        text5.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));
        text5.setX(300);
        text5.setY(15);

        Text text6 = new Text("1. nick_baggi, Nick, Brovski, 250$");
        text6.setFont(Font.font("verdana", FontPosture.REGULAR, 12));
        text6.setX(300);
        text6.setY(30);

        Text text7 = new Text("2. kle0pall, Masha, Terehova, 114$");
        text7.setFont(Font.font("verdana", FontPosture.REGULAR, 12));
        text7.setX(300);
        text7.setY(45);

        Text text8 = new Text("3. plo89595, Anton, Rudskiy, 560$");
        text8.setFont(Font.font("verdana", FontPosture.REGULAR, 12));
        text8.setX(300);
        text8.setY(60);

        Button button1 = new Button();
        button1.setText("List of all products:");
        button1.setTranslateX(10);
        button1.setTranslateY(80);

        Button button2 = new Button();
        button2.setText("List of all users:");
        button2.setTranslateX(300);
        button2.setTranslateY(80);

        Group root = new Group(text1, text2, text3, text4, text5, text6, text7, text8, button1, button2);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Info about Marketplace");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}