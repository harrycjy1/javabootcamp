package sec02_exam_DrawShape;

public class Shape {

		String color = "black";
		
		//기본 생성자(없으면 컴파일러가 알아서 추가해준다)
		
		public Shape() {}//생성자는 절대 상속이 안된다!
		
		public void draw() {
			//%n 개행
		System.out.printf("[color = %s]%n",color);
		}
}
