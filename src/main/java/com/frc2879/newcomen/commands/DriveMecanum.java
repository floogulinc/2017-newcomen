package com.frc2879.newcomen.commands;

import com.frc2879.newcomen.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;


/**
 */
public class DriveMecanum extends Command{
    
	public DriveMecanum(){
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        super("DriveMecanum");
        requires(Robot.drivetrain);
       
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	double x= Robot.oi.getStick().getX();
		double y= Robot.oi.getStick().getY();
		double twist= Robot.oi.getStick().getTwist();

		
    	Robot.drivetrain.getRobotDrive().mecanumDrive_Cartesian(x,y,twist, 0);

    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }


}
