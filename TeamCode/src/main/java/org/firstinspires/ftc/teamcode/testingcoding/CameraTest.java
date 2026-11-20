package org.firstinspires.ftc.teamcode.testingcoding;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
@TeleOp(name = "CameraTest")
public class CameraTest extends OpMode {

    AprilTagProcessor aprilTagProcessor;

    VisionPortal visionPortal;


    @Override
    public void init() {
        aprilTagProcessor = new AprilTagProcessor.Builder().build();

        visionPortal = VisionPortal.easyCreateWithDefaults(
                hardwareMap.get(WebcamName.class, "Webcam"),
                aprilTagProcessor
        );
    }

    @Override
    public void loop() {

    }
}
