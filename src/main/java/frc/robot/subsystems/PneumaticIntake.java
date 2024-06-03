package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticIntake extends SubsystemBase{

    // Most slap-down intakes have a roller-like feeding system, so for this example we only need one motor
    private final CANSparkMax intakeRoller;

    // This inatke has a slap-down intake using pnuematics
    // For this example, we will say it and the pnuematic control module (PCM) were made by CTRE (Cross the Road Electronics)
    // This also only has one soleniod, add another if your intake has one
    private final Solenoid intakeSoleniod;

    public PneumaticIntake () {

        intakeRoller = new CANSparkMax(0, MotorType.kBrushless);

        // In this code, you don't have to declare the compesser and the PCM seperatly, this does it all
        intakeSoleniod = new Solenoid(PneumaticsModuleType.CTREPCM, 0);

        // Be sure to set  the following  
        //      1. Correct IDs
        //      2. Smart Limits
        //      3. Burn Flashes
        //      4. Idle Modes
        //      5. Correct Channels

    }

    public void COMSUME () {

        intakeRoller.set(0.5);

        // Feel free to increase or decease the motor speed depending on the situation
        // Also make sure the motor is spining the right way

    }

    public void unCONSUME() {

        intakeRoller.set(-0.5);

        // Feel free to increase or decease the motor speed depending on the situation
        // Also make sure the motor is spining the right way

    }

    public void stopCONSUMING () {

        intakeRoller.set(0);

    }

    // Notice here we used a different way of setting up the command, the only difference is that we will not need to make an instant command

    public Command open () {
        return run( () -> {
            
            intakeSoleniod.set(true);
            
        });
    }

    public Command close () {
        return run( () -> {
            
            intakeSoleniod.set(false);
            intakeRoller.set(0);
            
        });
    }
    
}
