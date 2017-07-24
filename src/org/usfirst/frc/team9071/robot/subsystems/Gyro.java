package org.usfirst.frc.team9071.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gyro extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	ADXRS450_Gyro myGyro;
	RobotDrive rd = new RobotDrive(0,2,1,3);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public Gyro() {
    	myGyro = new ADXRS450_Gyro(SPI.Port.kOnboardCS0);
		myGyro.reset();
    }
    
    public double getAngle() {
		return myGyro.getAngle();
	}
    
    public void to_0deg(double angle) {
    	while(angle > 1.00 ||angle < -1) {
    		rd.mecanumDrive_Cartesian(0, -0.35, -angle/20, 0);
    	}
    }
}

