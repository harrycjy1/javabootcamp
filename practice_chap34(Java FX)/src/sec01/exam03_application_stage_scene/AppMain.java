package sec01.exam03_application_stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//VBox는 켄터에너 클래스의 한 종류이며 수직으로 내용(컨트롤)들을 배치하는 컨테이너이다(Parent를 상속받는다)
		VBox root = new VBox();
		root.setPrefWidth(500);
		root.setPrefHeight(350);
		root.setAlignment(Pos.CENTER); //중앙정렬
		root.setSpacing(20);		//배치되는 컨트롤의 간격을 20픽셀로 하겠다는 코드
		
		Label label = new Label();
		label.setText("안녕 자바");
		label.setFont(new Font(20));
		
		Button button = new Button();
		button.setText("확인");
		
		
		//람다식으로 버튼을 클릭시 종료되도록 이벤트 러리를 간단히 추가함
		button.setOnAction(event -> {
			System.out.println("플랫폼 종료");
			Platform.exit();
			}
		);
		
		
		/*button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
			Platform.exit();
			}
		});*/
		
		//VBox(루트컨테이너)에 컨트롤들을 배치한다
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		//Scene의 생성자의 매개값은 Parent라는 추상클래스이다
		//하여 상속받는 하위클래스 통상 컨테이너 클래스들이다.
		Scene scene = new Scene(root);
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show(); //윈도우 보여주기
		/*
		    이 예제의 목적
		  1. 먼저 Stage가 무대라는것 즉 윈도우창에 해당
		  2. 그 Stage가 설정되면 장면, 즉 Scene을 설정해준다.
		  3. 그리고 Scene을 설정할 때 매개값은 통상 Parent클래스가 오는데,
		  	  추상클래스이므로 하위 컨테이너 클래스를 넘겨준다.
		  4. Parent클래스를 상속받는 컨테이너에 각종 컨트롤을 추가배치
		*/
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}


}
