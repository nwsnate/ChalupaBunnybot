package org.usfirst.frc.team1540.robot.subsystems;
import org.usfirst.frc.team1540.robot.RobotMap;
import org.usfirst.frc.team1540.robot.commands.RotateArm;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	static Talon armTalon = new Talon(RobotMap.armMoveNumber);
	static Solenoid armNoid = new Solenoid(RobotMap.noid);
	
	public void armOpen() {
		//exampleSolenoid.set(true);
		//exampleSolenoid.set(false);
		armNoid.set(true);
	}
	
	public void armClose() {
		armNoid.set(false);
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new RotateArm());
	}
}