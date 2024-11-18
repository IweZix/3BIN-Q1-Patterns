public class PatternRobots {
	
	public static void fight(Robot robot1, Robot robot2) {
		int tick1=robot1.getFreq();
		int tick2=robot2.getFreq();
		while(robot2.diffLife(0)>0 && robot1.diffLife(0)>0) {
			int tick=Math.min(tick1, tick2);
			tick1-=tick;
			tick2-=tick;
			if (tick1==0) {// robot 1 feu
				tick1=shoot(robot1,robot2);
			}
			if (tick2==0) {// robot 2 feu
				tick2=shoot(robot2,robot1);
			}
		}
	}
	
	private static int shoot(Robot robot1, Robot robot2) {
		int dmg=Math.max(0,robot1.getCanon()-robot2.getShield());
		int lost=robot2.diffLife(0)-robot2.diffLife(-dmg);
		System.out.println(robot1.getName()+" shoots for "+lost);
		if (robot2.diffLife(0)<=0) {
			System.out.println("Kabooom "+robot2.getName());
		}
		return robot1.getFreq();
	}
	
	public static void main(String[] args) {
		Robot robot1 = new RobotBuilder.Builder().setCanon(10).setSchield(2).setFreq(100).build();
		robot1 = new DecoratorCanon(robot1);
		robot1 = new DecoratorSchield(robot1);
		System.out.println("attendu : \t20 4 100");
		System.out.println("reçu : \t\t" +  robot1.getCanon()+" "+robot1.getShield()+" "+robot1.getFreq());

		Robot robot2 = new RobotBuilder.Builder().setCanon(9).setSchield(3).setFreq(90).setLife(2).setName("Robot2").build();
		robot2 = new DecoratorCanon(robot2);
		robot2 = new DecoratorSchield(robot2);
		System.out.println("attendu : \t18 6 90");
		System.out.println("reçu : \t\t" +  robot2.getCanon()+" "+robot2.getShield()+" "+robot2.getFreq());

		fight(robot1, robot2);
		System.out.println();

		/* Exercice 3 avec Flyweight + AbstractFactory */

		FlyweightAbstract flyweight = new FlyweightAbstract();

		flyweight.put("PicVert", new FactoryPicVert());
		flyweight.put("Tank", new FactoryTank());
		flyweight.put("GrosseBerta", new FactoryGrosseBerta());

		Robot picVert = flyweight.createRobot("PicVert");

		System.out.println("attendu : \t10 2 200");
		System.out.println("reçu : \t\t" +  picVert.getCanon()+" "+picVert.getShield()+" "+picVert.getFreq());
		System.out.println();

		/* Exercice 3 avec Flyweight + Prototype */

		FlyweightPrototype flyweightPrototype = new FlyweightPrototype();

		Robot picVert2 = new RobotBuilder.Builder().setCanon(10).setSchield(2).setFreq(200).build();
		Robot tank = new RobotBuilder.Builder().setCanon(20).setSchield(5).setFreq(100).build();
		Robot grosseBerta = new RobotBuilder.Builder().setCanon(30).setSchield(10).setFreq(50).build();

		flyweightPrototype.put("PicVert", picVert2);
		flyweightPrototype.put("Tank", tank);
		flyweightPrototype.put("GrosseBerta", grosseBerta);

		try {
			Robot picVert3 = flyweightPrototype.createRobot("PicVert");
			System.out.println("attendu : \t10 2 200 ");
			System.out.println("\tAdresse de picVert2 : " + picVert2);
			System.out.println("reçu : \t\t" +  picVert3.getCanon()+" "+picVert3.getShield()+" "+picVert3.getFreq());
			System.out.println("\tAdresse de picVert3 : " + picVert3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}


	}
}
