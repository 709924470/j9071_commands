package org.usfirst.frc.team9071.robot.subsystems;

import org.usfirst.frc.team9071.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class traindrive extends Subsystem {
	RobotDrive rd = new RobotDrive(0,2,1,3);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive_normal(Joystick js,double gyroAngle) {
    	rd.mecanumDrive_Cartesian(js.getX(), js.getY(), js.getZ(), gyroAngle);
    }
    public void drive_polar(Joystick js,double gyroAngle) {
    	rd.mecanumDrive_Polar(mathHelper(js.getX(),js.getY(),false), mathHelper(js.getX(),js.getY(),true), js.getZ());
    }
    
    public void stop() {
    	rd.stopMotor();
    }
    
    public void forward(double time) {
    	rd.tankDrive(.7, .7);
    	Timer.delay(time);
    	stop();
    }
    
    public void left(double angle) {
    	rd.mecanumDrive_Cartesian(0, 0, angle, Robot.gyro.getAngle());
    	Timer.delay(angle);
    	stop();
    }
    
    public void right(double time) {
    	rd.tankDrive(.7, -.7);
    	Timer.delay(time);
    	stop();
    }
    public void back(double time) {
    	rd.tankDrive(-.7, -.7);
    	Timer.delay(time);
    	stop();
    }
	
    /*
     * This function helps you to get the magnitude and 
     * degree of a triangle
     *  @param x magnitude in X direction
     *  @param y magnitude in Y direction
     *  @param retDegree let the value returned be a angle is true
     */
    private double mathHelper(double x, double y, boolean retDegree) {
    	double hyp = Math.abs(Math.sqrt(x*x+y*y));
    	double deg = Math.toDegrees(Math.cos(y/hyp));
    	if(retDegree) {
    		return deg;
    	}
    	return hyp;
    }
}

