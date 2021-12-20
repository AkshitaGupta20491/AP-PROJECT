package com.example.demo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.util.*;
import java.io.*;

class threading extends Thread{
    ProgressBar p;
    threading(ProgressBar p){
        this.p = p;
    }
    /*public void run()  {

        double prog = p.getProgress();
        while(prog<=1){
            p.setProgress(prog+=0.00001);
            prog = p.getProgress();
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/
}

public class Game extends Application {

    double v = 0;
    static Stage mainstage;
    Scene scene1,scene2,scene3,scene4,scene5,scene6;

    public static void startgame() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);


    }

    public static void settings()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene4.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);

    }
    public static void exit2() throws IOException{
        mainstage.close();
    }
    public static void exit3() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
    }
    public static void exit4()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
    }
    public static void exit5()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene6.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
    }
    public static void exit6()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
    }
    public static  void exit7()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
    }
    public static void play(Parent root)throws IOException{
        System.out.println("from play!");
     //   FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene5.fxml"));
//        fxmlLoader.setController("Scene3Controller.java");
        Scene scene = new Scene(root);
        mainstage.setScene(scene);
    }
    public static void replay()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene4.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
    }


    @Override
    public void start(Stage stage) throws Exception {
        mainstage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
//        stage.setMaximized(true);//stage.setFullScreen(true);
        stage.show();
     /*   Scene scene1,scene2,scene3,scene4, scene5, scene6;

        //Scene 1 start
        Pane p1 = new Pane();
        p1.setStyle(
                "-fx-background-image: url(" +
                        "https://cdn.wallpapersafari.com/66/44/zldaLS.jpg" +
                        "); " +"-fx-background-position: center;"+
                        "-fx-background-size: stretch;"+"-fx-background-repeat: no-repeat;"
        );
        Text homet = new Text();
        homet.setText("Snake \n\t&\n\tladders");
        homet.setFont(Font.font("Chewy", FontWeight.BOLD,90));
        homet.setFill(Color.BROWN);
        homet.setStroke(Color.BLACK);
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));
        homet.setEffect(ds);
        homet.setLayoutX(10);
        homet.setLayoutY(80);



        ProgressBar pb = new ProgressBar();

//        threading t1 = new threading(pb);
//        t1.start();
        pb.setLayoutX(80);
        pb.setLayoutY(450);
//        EventHandler<ActionEvent> ev = new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent e)
//            {
//                v += 0.1;
//                pb.setProgress(v);
//            }
//        };




//        double prog = pb.getProgress();
//        while(prog<=1){
//            pb.setProgress(prog+=0.01);
//            prog = pb.getProgress();
//            TimeUnit.MILLISECONDS.sleep(100);
//        }

        pb.setPrefSize(300,30);
//        Circle cir = new Circle(50,100,50);

//        for(int i=0;i<=1;i+=0.01){
//            pb.setProgress(i);
////            TimeUnit.SECONDS.sleep(1);
//        }
        p1.getChildren().addAll(homet,pb);
//        p1.getChildren().add(homet);

        scene1 = new Scene(p1,800,800);

//        stage.setScene(scene1);

        // Scene 1 end




        // Scene 2 Start
        Pane p2=new Pane();
        p2.setStyle(
                "-fx-background-image: url(" +
                        "https://st4.depositphotos.com/4874705/24906/i/600/depositphotos_249066518-stock-photo-dark-red-hexagon-background-and.jpg" +
                        "); " +"-fx-background-position: center;"+
                        "-fx-background-size: stretch;"+"-fx-background-repeat: no-repeat;"
        );

        Text tsc1 = new Text(" Snake");

        tsc1.setFont(Font.font("Italic", FontWeight.BOLD,60));
        tsc1.setFill(Color.YELLOW);
        tsc1.setStroke(Color.BLACK);
        DropShadow ds1 = new DropShadow();
        ds1.setOffsetY(3.0f);
        ds1.setColor(Color.color(0.4f, 0.4f, 0.4f));
        tsc1.setEffect(ds);
        tsc1.setLayoutX(350);
        tsc1.setLayoutY(100);

        Text tsc2 = new Text("&");

        tsc2.setFont(Font.font("Italic", FontWeight.BOLD,60));
        tsc2.setFill(Color.YELLOW);
        tsc2.setStroke(Color.BLACK);
        DropShadow ds2 = new DropShadow();
        ds2.setOffsetY(3.0f);
        ds2.setColor(Color.color(0.4f, 0.4f, 0.4f));
        tsc2.setEffect(ds);
        tsc2.setLayoutX(430);
        tsc2.setLayoutY(200);

        Text tsc3 = new Text("Ladders");

        tsc3.setFont(Font.font("Italic", FontWeight.BOLD,60));
        tsc3.setFill(Color.YELLOW);
        tsc3.setStroke(Color.BLACK);
        DropShadow ds3 = new DropShadow();
        ds3.setOffsetY(3.0f);
        ds3.setColor(Color.color(0.4f, 0.4f, 0.4f));
        tsc3.setEffect(ds);
        tsc3.setLayoutX(350);
        tsc3.setLayoutY(300);


        Button bt1 = new Button();
        bt1.setText("New Game");
        bt1.setLayoutX(300);
        bt1.setLayoutY(400);
        bt1.setStyle("-fx-background-radius: 15;"+
                "-fx-padding: 5 25 5 25;"+
                "-fx-font-size: 35;"+
                "-fx-pref-width: 300;"+"-fx-color: #ffff66;");




        Button bt2 = new Button();
        bt2.setText("Sound");
        bt2.setLayoutX(300);
//        bt2.setLayoutX(350);
        bt2.setLayoutY(500);
        bt2.setStyle("-fx-background-radius: 15;"+
                "-fx-padding: 5 25 5 25;"+
                "-fx-font-size: 35;"+
                "-fx-pref-width: 300;"+"-fx-color: #ffff66;");

//        Image img = new Image(new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\com\\example\\demo\\icons8-back-arrow-100.png"));
//        ImageView iv = new ImageView(img);
//        iv.setPreserveRatio(true);
//        bt2.setGraphic(iv);

        Button bt3 = new Button();
        bt3.setText("Exit");
        bt3.setLayoutX(300);
        bt3.setLayoutY(600);
        bt3.setStyle("-fx-background-radius: 15;"+
                "-fx-padding: 5 25 5 25;"+
                "-fx-font-size: 35;"+
                "-fx-pref-width: 300;"+"-fx-color:#ffff66;");


        p2.getChildren().addAll(tsc1,tsc2,tsc3,bt1,bt2,bt3);
        scene2=new Scene(p2,800,800);
//
//        stage.setScene(scene2);
//        // Scene 2 end
//
//
//
//
//
//
//
//
//      Scene 3 start
        Pane p3 = new Pane();
        p3.setStyle(
                "-fx-background-image: url(" +
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkN2RHaQe8fWQ-_6QWY0dm_6sdR5lRgGu73w&usqp=CAU" +
                        "); " +"-fx-background-position: center;"+
                        "-fx-background-size: stretch;"+"-fx-background-repeat: no-repeat;"
        );


        Text t7 = new Text("Player 1");
        t7.setFont(Font.font("Arial", FontWeight.BOLD,70));
        t7.setLayoutX(700);
        t7.setLayoutY(150);
        Text t1 = new Text("User name: ");
        t1.setFont(Font.font("Arial", FontWeight.BOLD,30));
        t1.setLayoutX(450);
        t1.setLayoutY(250);


        TextField tf1 = new TextField();

        tf1.setLayoutX(630);
        tf1.setLayoutY(230);
        Text t2 = new Text("Color: ");
        t2.setFont(Font.font("Arial", FontWeight.BOLD,30));
        t2.setLayoutX(450);
        t2.setLayoutY(350);


        Text t8 = new Text("Player 2");
        t8.setFont(Font.font("Arial", FontWeight.BOLD,70));
        t8.setLayoutX(700);
        t8.setLayoutY(500);
        Text t9 = new Text("User name: ");
        t9.setFont(Font.font("Arial", FontWeight.BOLD,30));
        t9.setLayoutX(450);
        t9.setLayoutY(600);


        TextField tf2 = new TextField();

        tf2.setLayoutX(630);
        tf2.setLayoutY(580);
        Text t10 = new Text("Color: ");
        t10.setFont(Font.font("Arial", FontWeight.BOLD,30));
        t10.setLayoutX(450);
        t10.setLayoutY(710);


        Button bt4 = new Button();// for going back;
        bt4.setStyle("-fx-color:#ffff66;");


        Image img = new Image(new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\com\\example\\demo\\icons8-back-arrow-100.png"));
        ImageView iv = new ImageView(img);
        iv.setFitHeight(40);
        iv.setFitWidth(40);
//        iv.setPreserveRatio(true);
        bt4.setGraphic(iv);

        bt4.setLayoutX(300);
        bt4.setLayoutY(40);

//
//
        p3.getChildren().addAll(t7,t1,tf1,t2,bt4,t8,t9,t10,tf2);
        scene3 = new Scene(p3,800,800);
        stage.setScene(scene3);
//        //Scene 3 end
//
//
//
//
//        //Scene 4 start
//        Pane p4 = new Pane();
//
//        Button bt5 = new Button();  // for music
//        Button bt6 = new Button();  // for dice
//        Button bt7 = new Button();  // for back button
//
//
//        Text t3 = new Text("Player1 Username");
//        Text t4 = new Text("Player2 Username");
//
//        p4.getChildren().addAll(bt5,bt6,bt6,bt7,t3,t4);

//        scene4 = new Scene(p4);

//        //Scene 4 end
//
//
//
//
//        //Scene 5 start
//        Pane p5 = new Pane();
//        Text t5 = new Text("Are you sure you want to quit!");
//        Button bt8 = new Button();  //yes
//        Button bt9 = new Button();  // no
//        bt8.setText("YES");
//        bt9.setText("NO");
//
//        p5.getChildren().addAll(bt8,bt9,t5);
//        scene5 = new Scene(p5);
//        //Scene 5 end
//
//
//
//
//        //Scene 6 start
//        Pane p6 = new Pane();
//        Text t6 = new Text("Winner is ........");
//        Button bt10 = new Button(); //New Game
//        Button bt11 = new Button(); //Menu Button
//        scene6 = new Scene(p6);
        //Scene 6 end



        stage.show();

*/

    }
}
