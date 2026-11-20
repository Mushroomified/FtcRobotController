package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Transfer extends Subsystem {

    final double SHOOT_TIME = 1.0;

    ElapsedTime elapsedTime = new ElapsedTime(99);

    DcMotor shootingMotor;
    DcMotor transferMotor;



    public void init(OpMode opMode){
        this.instantiateSubsystem(opMode);
        shootingMotor = hardwareMap.get(DcMotor.class,"shooter");
        transferMotor = hardwareMap.get(DcMotor.class,"transfer");

    }

<<<<<<< HEAD
    boolean isOpposite = false;
    public void loop(){
        if(gamepad1.y){
            motor.setPower(-1);
            isOpposite = true;
        } else {
            if (gamepad1.a) {
                elapsedTime.reset();
                isOpposite = false;
            }

            if (!isOpposite && elapsedTime.seconds() <= SHOOT_TIME) {
                motor.setPower(1);
            } else {
                motor.setPower(0);
            }
=======
    public void loop() {
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
            shootingMotor.setPower(-1);
        } else if (elapsedTime.seconds() <= SHOOT_TIME) {
            shootingMotor.setPower(1);
        } else {
            shootingMotor.setPower(0);
>>>>>>> b3be9cad902e2fa32cb45d9616c8161a89a0a4a9
        }

    }

}
