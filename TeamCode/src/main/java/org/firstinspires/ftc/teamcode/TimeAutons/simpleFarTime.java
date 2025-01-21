package org.firstinspires.ftc.teamcode.TimeAutons;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.FireHardwareMap;

@Autonomous(name="simpleFarTime", group="TimeAutons")
@Config
public class simpleFarTime extends LinearOpMode {
    FireHardwareMap robot = null;

    @Override
    public void runOpMode() {
        robot = new FireHardwareMap(this.hardwareMap);


        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        if (opModeIsActive()) {
//            robot.armServo.setPower(0.1);
//            robot.clawServo.setPower(0.1);
//            robot.frontLeftMotor.setPower(0.63);
//            robot.frontRightMotor.setPower(0.5);
//            robot.backRightMotor.setPower(0.5);
//            robot.backLeftMotor.setPower(0.63);
//            sleep(1750); // ADJUST ADJUST ADJUST
//
//            pause();
//
//            turnLeft();
//            robot.clawServo.setPower(0.1);
//            sleep(425);
//
//            pause();
//
//            robot.slideMotor.setPower(0.9);
//            robot.armServo.setPower(0.1);
//            robot.clawServo.setPower(0.1);
//            sleep(3000);
//
//            pause();
//
//            // move forward
//            moveForward();
//            robot.slideMotor.setPower(0.75);
//            robot.clawServo.setPower(0.1);
//            sleep(400);
//
//            pause();
//
//            robot.armServo.setPower(0.05);
//            robot.clawServo.setPower(0.1);
//            sleep(800);
//
//            robot.armServo.setPower(0.05);
//            robot.clawServo.setPower(-0.5);
//            sleep(800);
//
//            // move backward
//            robot.frontLeftMotor.setPower(-0.56);
//            robot.frontRightMotor.setPower(-0.5);
//            robot.backLeftMotor.setPower(-0.5);
//            robot.backRightMotor.setPower(-0.56);
//            sleep(200);
//
//            pause();
//
//            pause();
//
//            turnLeft();
//            robot.slideMotor.setPower(-0.9);
//            sleep(1154); // fix
//
//            // park
//            robot.armServo.setPower(0.15);
//            robot.frontLeftMotor.setPower(0.56*1.5);
//            robot.frontRightMotor.setPower(0.5*1.5);
//            robot.backRightMotor.setPower(0.5*1.5);
//            robot.backLeftMotor.setPower(0.56*1.5);
//            robot.slideMotor.setPower(-0.9);
//            sleep(700); // fix
//
//            robot.slideMotor.setPower(-0.9);
//            robot.armServo.setPower(0.15);
//            sleep(1000);

            turnLeft();
            sleep(20);

            moveForward();
            sleep(2000);
        }
    }

    public void moveForward() {
        robot.armServo.setPower(0.15);
        robot.frontLeftMotor.setPower(0.5);
        robot.frontRightMotor.setPower(0.5);
        robot.backRightMotor.setPower(0.5);
        robot.backLeftMotor.setPower(0.5);
    }
    public void turnLeft() {
        robot.armServo.setPower(0.15);
        robot.frontLeftMotor.setPower(-0.5);
        robot.frontRightMotor.setPower(0.5);
        robot.backRightMotor.setPower(0.5);
        robot.backLeftMotor.setPower(-0.5);
    }
    public void turnRight() {
        robot.armServo.setPower(0.15);
        robot.frontLeftMotor.setPower(0.5);
        robot.frontRightMotor.setPower(-0.5);
        robot.backRightMotor.setPower(-0.5);
        robot.backLeftMotor.setPower(0.5);
    }

    public void pause() {
        robot.frontLeftMotor.setPower(0.0);
        robot.frontRightMotor.setPower(0.0);
        robot.backLeftMotor.setPower(0.0);
        robot.backRightMotor.setPower(0.0);

        sleep(200);
    }
}