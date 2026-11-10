package org.firstinspires.ftc.teamcode.testingcoding;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name="MotorTest")
public class MotorTest extends OpMode{


    /* Declare OpMode members. */
    public DcMotor  motor   = null;

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        // Define and Initialize Motors
          motor = hardwareMap.get(DcMotor.class, "motor");
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit START
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits START
     */
    @Override
    public void start() {
    }

    /*
     * Code to run REPEATEDLY after the driver hits START but before they hit STOP
     */
    @Override
    public void loop() {
        double power;

        // Run wheels in tank mode (note: The joystick goes negative when pushed forward, so negate it)
        power = -gamepad1.left_stick_y;

        motor.setPower(power);
        ;
        telemetry.addData("power", "%.2f", power);
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}
