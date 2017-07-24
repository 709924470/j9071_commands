package org.usfirst.frc.team9071.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearControl extends Subsystem {
	SpeedController mo = new Talon(4);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void reset() {
    	mo.set(0.5);
		Timer.delay(0.5);
		mo.stopMotor();
    }
    public void up() {
    	mo.set(-0.3);
    }
    public void down() {
    	mo.set(0.2);
    }
}

