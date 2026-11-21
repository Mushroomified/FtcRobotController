package org.firstinspires.ftc.teamcode.testingcoding;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.TurnDirection;
import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;
@Tele
public class TurningTest extends OpMode {

    Drivetrain drivetrain = new Drivetrain();

    ElapsedTime elapsedTime = new ElapsedTime();

    @Override
    public void init() {
        drivetrain.init(this);
    }


    int ms = 500;

    @Override
    public void loop() {

        if(gamepad1.dpad_up)
            ms += 10;

        if(gamepad1.dpad_down)
            ms -= 10;

        if(gamepad1.dpad_left)
            ms -= 1;

        if(gamepad1.dpad_right)
            ms += 1;


        if(gamepad1.b){
            elapsedTime.reset();
            drivetrain.TESTMSturnInPlace(TurnDirection.LEFT,0.5,ms);
        }

        if(gamepad1.a){
            elapsedTime.reset();
            drivetrain.TESTturnInPlace(TurnDirection.LEFT,0.5);
        }

        telemetry.addData("ms:",ms);
        telemetry.addData("Time: ", elapsedTime);


    }
}
