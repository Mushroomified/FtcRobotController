package org.firstinspires.ftc.teamcode.testingcoding;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;


@TeleOp(name="SensorTest")
public class SensorTest extends OpMode{


    /* Declare OpMode members. */
    public DistanceSensor distanceSensor1   = null;
    public DistanceSensor distanceSensor2   = null;
    double distance1;
    double distance2;
    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        // Define and Initialize Motors

        distanceSensor1 = hardwareMap.get(DistanceSensor.class, "distance_sensor1");
        distanceSensor2 = hardwareMap.get(DistanceSensor.class,"distance_sensor2");
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
        distance1 = distanceSensor1.getDistance(DistanceUnit.CM);
        distance2 = distanceSensor2.getDistance(DistanceUnit.CM);

        telemetry.addData("distance1 (cm)", "%.2f", distance1);
        telemetry.addData("distance2 (cm)", "%.2f", distance2);
        telemetry.addData("d1+d2 (cm)", "%.2f", distance1+distance2);
        telemetry.addData("d1-d2(cm)", "%.2f", distance1-distance2);

    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}
