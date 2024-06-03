package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Converyer  extends SubsystemBase{

    private final CANSparkMax feedMotor;

    // Add any more motors if you have them

    public Converyer () {

        feedMotor = new CANSparkMax(0, MotorType.kBrushless);

        // Be sure to set  the following  
        //      1. Correct IDs
        //      2. Smart Limits
        //      3. Burn Flashes
        //      4. Idle Modes

    }

    public void feed () {
        
        feedMotor.set(0.3);

    }

    public void stopFeeding () {

        feedMotor.set(0);

    }

    // We don't need an outake as once it's in the conveyer, it is primed for shooting or wherever it goes
    // You can feel free to make one however, just as a precaution for oopsies
    
}
