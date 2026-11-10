package org.firstinspires.ftc.teamcode.teleop;

import android.graphics.Path;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Transfer;


@TeleOp(name="FullTeleOp")
public class FullTeleOp extends OpMode {

    Drivetrain drivetrain = new Drivetrain();
    Intake intake = new Intake();
    Transfer transfer = new Transfer();

    @Override
    public void init(){
        drivetrain.init(this);
        intake.init(this);
        transfer.init(this);

    }

    @Override
    public void loop() {
        drivetrain.loop();
        intake.loop();
        transfer.loop();

    }


}
