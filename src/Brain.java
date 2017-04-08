import processing.core.PApplet;

/***
 * This is the class where the student will write their robot code.
 * 
 * @author keith
 *
 */
public class Brain extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("Processing");
	}

	public Brain(Roomba roomba) {
		super(roomba);
		this.roomba = roomba;
	}

	/**
	 * The initialize method will be called once at the start of the program.
	 * (think of "setup method in processing")
	 */
	public void initialize() {
		driveDirect(-500, -500);
	}

	/**
	 * The loop method repeats (think of the draw method)
	 */
	public void loop() {

	}

}