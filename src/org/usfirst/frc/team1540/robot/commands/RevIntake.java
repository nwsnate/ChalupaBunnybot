package org.usfirst.frc.team1540.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1540.robot.Robot;

public class RevIntake extends Command {
	public RevIntake() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.intake); //The object initialized in robot.java
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		System.out.println("Calling rev_intake");
		Robot.intake.rev_intake();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		//System.out.println("Execute Called");
		//Robot.intake.rev_intake();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
//		System.out.println("Calling stop_intake");
//		Robot.intake.stop_intake();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		System.out.println("Calling stop_intake");
		Robot.intake.stop_intake();
	}
}
