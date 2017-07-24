package org.usfirst.frc.team9071.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RopeControl extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	SpeedController sc = new Talon(5);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void goup() {
    	sc.set(.6);
    }
    public void stop() {
    	sc.stopMotor();
    }
    public void down() {
    	sc.set(-.3);
    }
}

