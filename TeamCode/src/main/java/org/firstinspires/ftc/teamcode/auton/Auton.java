package org.firstinspires.ftc.teamcode.auton;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.TurnDirection;
import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;

public class Auton extends LinearOpMode {

    Drivetrain drivetrain = new Drivetrain();


    @Override
    public void runOpMode() throws InterruptedException {
        drivetrain.init(this);
        drivetrain.driveForward(1,1000);
        drivetrain.turnInPlace(TurnDirection.LEFT,0.5);

    }





}
