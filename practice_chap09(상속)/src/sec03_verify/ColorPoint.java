package sec03_verify;

public class ColorPoint extends Point {
	
	
		String 		color;
			
			
		void setColor(String color) {
			this.color = color;
		}
		void showColorPoint() {
			System.out.print("색상이 "+this.color+"점의 좌표 : ");
			showpoint();
		}
				
		public ColorPoint() {
			
		}
}
