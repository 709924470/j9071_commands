package org.usfirst.frc.team9071.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	Joystick js = new Joystick(0);

	public Joystick getStick() {
		return js;
	}
	
	public OI() {
		
	}
}
