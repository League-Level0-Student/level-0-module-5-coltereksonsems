package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// loopOne();
		// loopTwo();
		// loopThree();
		//loopFour();
		//loopFive();
	  	  //loopSix();
		//loopSeven();
	}

	static void loopOne() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}

	static void loopTwo() {
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
	}

	static void loopThree() {
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

	static void loopFour() {
		
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1)
				System.out.println(i);

		}
	}
static void loopFive() {
		
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1)
				System.out.println(i);
}}
static void loopSix() {
	for (int i = 7; i < 784; i+=7) {
		System.out.println(i);
	}
}

static void loopSeven (){
	int age = 0;
	for (int i = 2008; i < 2021; i++) {
		System.out.println("in "+(i)+" i was "+(age)+" years old."); 
		age++;
	}
}




}
		
		
		
		