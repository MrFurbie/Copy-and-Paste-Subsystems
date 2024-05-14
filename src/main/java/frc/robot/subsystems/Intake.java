package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

    private final CANSparkMax intakeMotor;

    //Make sure you add any other motors, if any

    // DONT USE THIS CODE IF INTAKE USES PNUMATICS FOR A SLAP DOWN

    public Intake () {

        intakeMotor = new CANSparkMax(0, MotorType.kBrushless);

        // Be sure to set  the following  
        //      1. Correct IDs
        //      2. Smart Limits
        //      3. Burn Flashes
        //      4. Idle modes

    }

    public void COMSUME () {

        intakeMotor.set(0.5);

        // Feel free to increase or decease the motor speed depending on the situation

    }

    public void unCONSUME() {

        intakeMotor.set(-0.5);

        // Feel free to increase or decease the motor speed depending on the situation

    }

    public void stopCONSUMING () {

        intakeMotor.set(0);

    }
}
