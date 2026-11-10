package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class Intake extends Subsystem {
    DcMotor motor;

    CRServo leftServo;
    CRServo rightServo;

    public void init(OpMode opMode){
        this.instantiateSubsystem(opMode);
        motor = hardwareMap.get(DcMotor.class,"intake");
        leftServo = hardwareMap.get(CRServo.class,"left_servo");
        rightServo = hardwareMap.get(CRServo.class,"right_servo");
    }

    public void loop(){
        if(gamepad1.right_bumper){
            motor.setPower(1);
            leftServo.setPower(1);
            rightServo.setPower(1);
        } else {
            motor.setPower(0);
            leftServo.setPower(0);
            rightServo.setPower(0);
        }

    }

}
