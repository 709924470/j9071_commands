package org.usfirst.frc.team9071.robot.commands;

import org.usfirst.frc.team9071.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopCommand extends Command {
	boolean fin = false;

    public StopCommand() {
        requires(Robot.drivet);
    }
    protected void execute() {
    	Robot.drivet.stop();
    	Timer.delay(.5);
    	fin = true;
    }
    protected boolean isFinished() {
        return fin;
    }
}
