package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.spikes2212.command.genericsubsystem.MotoredGenericSubsystem;
import com.spikes2212.util.TalonEncoder;


public class Shooter extends MotoredGenericSubsystem {
    private final TalonEncoder talonEncoder;

    public Shooter(WPI_TalonSRX motor, WPI_TalonSRX motor2) {
        super("Motors", motor,motor2);
        motorControllerGroup.setInverted(true);
         this.talonEncoder = new TalonEncoder(motor2);
         this.talonEncoder.setDistancePerPulse(1/(4096*(double)(42/24)*1.3));
    }
    public double getSpeed(){
        return this.talonEncoder.getVelocity()*10;

    }

}
