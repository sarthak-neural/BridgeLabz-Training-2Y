package LambdaExpression;

@FunctionalInterface
interface Light {
	void trigger();
}

public class SmartHome {
	public static void main(String[] args) {
		
		Light motion = () -> System.out.println("Light turns ON by Motion Sensor.");
		Light time = () -> System.out.println("Light turns ON by Time Schedule.");
		Light voice = () -> System.out.println("Light turns ON by Voice Command.");
		
		motion.trigger();
		time.trigger();
		voice.trigger();
	}
}