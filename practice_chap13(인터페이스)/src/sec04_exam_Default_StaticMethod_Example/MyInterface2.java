package sec04_exam_Default_StaticMethod_Example;

public interface MyInterface2 {

		//default는 기본적으로 접근제어자가 public
		public default void method3() {
			System.out.println("인터페이스 2에 선언된 디폴트 메서드1 호출");
		}
		
		public default void method4() {
			System.out.println("인터페이스 2에 선언된 디폴트 메서드2 호출");
		}
		
		public static void staticMethod() {
			System.out.println("인터페이스 2에 선언된 정적(static)메서드 호출");
		}
	}
