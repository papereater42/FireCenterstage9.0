package org.firstinspires.ftc.teamcode.TimeAutons;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.FireHardwareMap;

@Autonomous(name="farAutonTime", group="TimeAutons")
@Config
public class farTime extends LinearOpMode {
    FireHardwareMap robot = null;

    @Override
    public void runOpMode() {
        robot = new FireHardwareMap(this.hardwareMap);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        if (opModeIsActive()) {
            robot.armServo.setPower(0.1);
            robot.clawServo.setPower(0.1);
            robot.frontLeftMotor.setPower(0.63);
            robot.frontRightMotor.setPower(0.5);
            robot.backRightMotor.setPower(0.5);
            robot.backLeftMotor.setPower(0.63);
            sleep(1750); // ADJUST ADJUST ADJUST

            pause();

            turnLeft();
            robot.clawServo.setPower(0.1);
            sleep(425);

            pause();

            robot.slideMotor.setPower(0.9);
            robot.armServo.setPower(0.1);
            robot.clawServo.setPower(0.1);
            sleep(3000);

            pause();

            // move forward
            moveForward();
            robot.slideMotor.setPower(0.75);
            robot.clawServo.setPower(0.1);
            sleep(400);

            pause();

            robot.armServo.setPower(0.05);
            robot.clawServo.setPower(0.1);
            sleep(800);

            robot.armServo.setPower(0.05);
            robot.clawServo.setPower(-0.5);
            sleep(800);

            // move backward
            robot.frontLeftMotor.setPower(-0.56);
            robot.frontRightMotor.setPower(-0.5);
            robot.backLeftMotor.setPower(-0.5);
            robot.backRightMotor.setPower(-0.56);
            sleep(200);

            pause();

            // make slides go down
            robot.slideMotor.setPower(-0.9);
            robot.armServo.setPower(0.1);
            sleep(775);

            // turn right
            turnRight();
            robot.slideMotor.setPower(-0.9);
            robot.clawServo.setPower(0.12);
            sleep(935); // fix, prev 920

            moveForward();
            robot.slideMotor.setPower(-0.9);
            sleep(670); // fix

            pause();

            robot.slideMotor.setPower(-0.9);
            sleep(900);

            robot.slideMotor.setPower(0);
            robot.armServo.setPower(-0.3); // arm go down
            robot.clawServo.setPower(-0.3); // claw open
            sleep(1000); // fix

            robot.clawServo.setPower(0.5); // claw close
            robot.armServo.setPower(0.1);
            sleep(500); // fix

            robot.clawServo.setPower(0.1); // keep block stable
            robot.armServo.setPower(0.9); // arm go up
            sleep(750); // fix

            turnRight(); // 180 - this
            robot.clawServo.setPower(0.1);
            robot.armServo.setPower(0.5);
            sleep(1500); // fix

            // go back to basket
            moveForward();
            robot.clawServo.setPower(0.1);
            sleep(590); // fix

            // adjust to drop
            turnRight();
            robot.clawServo.setPower(0.1);
            sleep(415);


            // from beginning
            pause();

            robot.slideMotor.setPower(0.75);
            robot.armServo.setPower(0.1);
            robot.clawServo.setPower(0.1);
            sleep(3000);

            pause();

            // move forward
            moveForward();
            robot.slideMotor.setPower(0.75);
            robot.clawServo.setPower(0.1);
            sleep(255);

            pause();

            robot.armServo.setPower(0.05);
            robot.clawServo.setPower(0.1);
            sleep(800);

            robot.armServo.setPower(0.05);
            robot.clawServo.setPower(-0.5);
            sleep(800);

            // move backward
            robot.frontLeftMotor.setPower(-0.56);
            robot.frontRightMotor.setPower(-0.5);
            robot.backLeftMotor.setPower(-0.5);
            robot.backRightMotor.setPower(-0.56);
            sleep(200);

            turnLeft();
            robot.slideMotor.setPower(-0.9);
            sleep(1154); // fix

            // park
            robot.armServo.setPower(0.15);
            robot.frontLeftMotor.setPower(0.56*1.5);
            robot.frontRightMotor.setPower(0.5*1.5);
            robot.backRightMotor.setPower(0.5*1.5);
            robot.backLeftMotor.setPower(0.56*1.5);
            robot.slideMotor.setPower(-0.9);
            sleep(700); // fix

            robot.slideMotor.setPower(-0.9);
            robot.armServo.setPower(0.15);
            sleep(1000); // adjust based on time remaining
        }
    }

    public void moveForward() {
        robot.armServo.setPower(0.15);
        robot.frontLeftMotor.setPower(0.56);
        robot.frontRightMotor.setPower(0.5);
        robot.backRightMotor.setPower(0.5);
        robot.backLeftMotor.setPower(0.56);
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