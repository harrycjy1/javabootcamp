package sec02_exam_create_multiThread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		//직접 생상하는 멀티스레드로 하는 3가지 방법
		//방법1 --> 직접생성
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//방법2 --> 익명구현클래스 이용
		
		/*Thread thread = new Thread(new Runnable() {
			
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});*/
		
		//방법 3
		/*람다식이용하여 초간단화 ()는 run메서드의 매개변수를 의미하는데 매개변수가 1개도 없다는것을 의미한다 
		{}는 run()의 실행블럭을 의미
		*/
		/*Thread thread1 = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});*/
		
		//Thread thread = new Thread(new BeepTask());
		thread.start(); //run()을 main스레드가 실행하라고지시함. 이때부터 main 스레드와 
						//beeptask스레드가 동시에 실행됨, beep음 5번실행
		//아래는 메인스레드가 실행되는 부분
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
}
