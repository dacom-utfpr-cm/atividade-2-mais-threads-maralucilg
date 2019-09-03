package ex1;

public class ThreadExemplo3 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Enquanto o Congresso\n" + 
				"da República discute\n" + 
				"indefinidamente essa\n" + 
				"alarmante sequência de\n" + 
				"eventos, o Chanceler Supremo\n" + 
				"enviou, secretamente, dois\n" + 
				"Cavaleiros Jedi, guardiões da\n" + 
				"paz e da justiça na galáxia,\n" + 
				"para porem fim ao conflito...");

		try {
		Thread.sleep(10000);
		}
		catch (Exception e) {
			System.out.println("Oh não, destroyers!")
		}
		
	}

}
