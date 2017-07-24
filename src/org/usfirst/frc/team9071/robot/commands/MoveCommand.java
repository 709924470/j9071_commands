package org.usfirst.frc.team9071.robot.commands;

import org.usfirst.frc.team9071.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveCommand extends Command {
	private String m;
	private double t_a;

    public MoveCommand(String mode, double ti_an) {
        requires(Robot.drivet);
        requires(Robot.gyro);
        this.m = mode;
        this.t_a = ti_an;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	switch(m) {
    	case "f":
    		Robot.drivet.forward(t_a);
    		break;
    	case "b":
    		Robot.drivet.back(t_a);
    		break;
    	case "l":
    		Robot.drivet.left(t_a);
    		break;
    	case "r":
    		Robot.drivet.right(t_a);
    		break;
    	default:
    		Robot.gyro.to_0deg(Robot.gyro.getAngle());
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
