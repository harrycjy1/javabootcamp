package sec02_exam_DrawShape;

public class DarwShapeExample {

	public static void main(String[] args) {
		
			//point 배열을 각각 초기화
		
		Point[] p =new Point[] {	new Point(100,100),
									new Point(140, 50),
									new Point(200,100)
		};

		//초기화된 배열의 2차원 주소값을 Triangle생성자에 주소값ㅇ로 넘긴다
		
		Triangle t = new Triangle(p);
		Circle c= new Circle(new Point(150,150),50);
		Circle c1= new Circle();
		
		t.color = "노랑";
		c.color = "파랑";
		c1.color = "녹색";
		System.out.println("삼각형의 각 점 (좌표)들과 생상을 나타냄");
		t.draw();
		
		System.out.println("원의 원점과 반지름, 색상을 나타냄");
		c.draw();
		c1.draw();
		
	}

}
