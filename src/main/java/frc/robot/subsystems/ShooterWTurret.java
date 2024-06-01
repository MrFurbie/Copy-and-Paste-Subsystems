package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


// In this folder, this will be code for a turret, and the code for its shooter as well
// We will also use magnetic switches to stop the turret from overturning 
public class ShooterWTurret  extends SubsystemBase{
    
    // This is the motor that controls the flywheel, add more if there is other motors
    // BE SURE THAT YOU KNOW WHICH WAY THEY SHOOT THAT WAY YOU DON'T SEND THEM OPPISITE WAYS AND BREAK EVERTHING
    private final CANSparkMax turretShooterMotor;

    // Now we will declare the turret motor
    // There is usually only one, but there may be more
    private final CANSparkMax turretRotateMotor;

    public ShooterWTurret () {

        // Now we define the shooter motor
        turretShooterMotor = new CANSparkMax(0, MotorType.kBrushless);

        // Then the turret motor
        turretRotateMotor = new CANSparkMax(0, MotorType.kBrushless);

        // Be sure to set  the following  
        //      1. Correct IDs
        //      2. Smart Limits
        //      3. Burn Flashes
        //      4. Idle modes

    }

    // Now we make the shooting commands and turret rotation commands

    public void shoot () {

        // Incease or decrease the speed if you need to
        turretShooterMotor.set(0.5);

    }

    // Feel free to add different shooting speeds for differents distances

    public void turretRight () {

        // Make sure you invert the motor if you need to
        turretRotateMotor.set(0.3);

    }
    
    public void turretLeft () {

        // Make sure you invert the motor if you need to
        turretRotateMotor.set(-0.3);

    }

}
