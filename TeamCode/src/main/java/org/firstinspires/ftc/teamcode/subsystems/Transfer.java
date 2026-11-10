package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.concurrent.TimeUnit;

public class Transfer extends Subsystem {

    final double SHOOT_TIME = 2.0;

    ElapsedTime elapsedTime = new ElapsedTime(99);

    DcMotor motor;



    public void init(OpMode opMode){
        this.instantiateSubsystem(opMode);
        motor = hardwareMap.get(DcMotor.class,"transfer");

    }

    public void loop(){
        if(gamepad1.a){
            elapsedTime.reset();
            telemetry.addLine("yipee");
        }

        if(elapsedTime.seconds() <= SHOOT_TIME){
            motor.setPower(1);
        } else {
            motor.setPower(0);
        }

    }

}
