package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter  extends SubsystemBase{

    private final CANSparkMax topFlywheel;
    private final CANSparkMax bottomFlywheel;

    public Shooter () {

        topFlywheel = new CANSparkMax(0, MotorType.kBrushless);
        bottomFlywheel = new CANSparkMax(0, MotorType.kBrushless);
        
        // Be sure to set  the following  
        //      1. Correct IDs
        //      2. Smart Limits
        //      3. Burn Flashes
        //      4. Idle Modes

    }

    public void shootClose () {

        topFlywheel.set(0.3);
        bottomFlywheel.set(-0.3);

    }

    public void shootMedium () {

        topFlywheel.set(0.7);
        bottomFlywheel.set(-0.7);

    }

    public void projectileVommit () {

        topFlywheel.set(1);
        bottomFlywheel.set(-1);

    }

    public void stopShooting () {

        topFlywheel.set(0);
        bottomFlywheel.set(0);

    }
    
}
