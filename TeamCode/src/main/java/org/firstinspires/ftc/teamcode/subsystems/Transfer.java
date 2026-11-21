package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.concurrent.TimeUnit;

public class Transfer extends Subsystem {

    final double SHOOT_TIME = 1.0;

    double POWER = 1;
    ElapsedTime elapsedTime = new ElapsedTime(99);


    DcMotor shootingMotor;
    DcMotor transferMotor;



    public void init(OpMode opMode){
        this.instantiateSubsystem(opMode);
        transferMotor = hardwareMap.get(DcMotor.class,"transfer");
        shootingMotor = hardwareMap.get(DcMotor.class, "shooter");

    }


    public void loop() {
        if(gamepad1.dpadUpWasPressed())
            POWER += 0.01;
        if(gamepad1.dpadDownWasPressed())
            POWER -= 0.01;

        if (POWER > 1)
            POWER = 1;
        else if (POWER < 0)
            POWER = 0;


        if (gamepad1.right_trigger_pressed) {
            transferMotor.setPower(1);
        } else if (gamepad1.left_trigger_pressed) {
            transferMotor.setPower(-1);
        } else {
            transferMotor.setPower(0);
        }


        if (gamepad1.a) {
            elapsedTime.reset();
        }

        if (gamepad1.y) {
            shootingMotor.setPower(-POWER);
        } else if (elapsedTime.seconds() <= SHOOT_TIME) {
            shootingMotor.setPower(POWER);
        } else {
            shootingMotor.setPower(0);
        }

        telemetry.addData("Power",POWER);

    }

}
