package org.firstinspires.ftc.teamcode.EncoderAutons;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.FireHardwareMap;

import java.util.List;

@Autonomous(name="farAuton", group="Auton")
public class farAuton extends LinearOpMode {
    FireHardwareMap robot = null;
    BasicAutoDriving bad = null;

    @Override
    public void runOpMode() {
        robot = new FireHardwareMap(this.hardwareMap);

        bad = new BasicAutoDriving(robot.frontLeftMotor, robot.frontRightMotor, robot.backLeftMotor, robot.backRightMotor);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        if (opModeIsActive()){
            robot.armServo.setPower(0.05);
            bad.strafe(-22);
            robot.slideMotor.setPower(0.825);
            sleep(750);
            bad.drive(188);
            sleep(4000);
            robot.slideMotor.setPower(0.05);
            bad.turn(-37);
            sleep(1500);
//            bad.drive(4);
//            sleep(1000); // 200 before stop for ahaan inertia
            robot.armServo.setPower(-0.9);
//            robot.slideMotor.setPower(0.05);
            sleep(300);
//            robot.armServo.setPower(0.9);
//            sleep(100);
//            robot.armServo.setPower(-0.9);
//            sleep(100);
//            robot.armServo.setPower(0.9);
//            sleep(100);
//            robot.armServo.setPower(-0.9);
//            sleep(100);
//            robot.armServo.setPower(0.9);
//            sleep(100);
//            robot.armServo.setPower(-0.9);
//            sleep(100);
            robot.armServo.setPower(0.95);
            sleep(500);
            bad.drive(-5);
            sleep(100);
            robot.armServo.setPower(0.075);
            robot.slideMotor.setPower(-0.755);
            bad.turn(107.5);
            sleep(1500);
            robot.armServo.setPower(0.05);
            bad.drive(48);
            sleep(2000);
            robot.slideMotor.setPower(0);
            bad.strafe(-10); // FIX
            sleep(200);
            bad.drive(15);
            sleep(200);
            robot.armServo.setPower(-0.39); // -0.39
            sleep(1000);
            robot.armServo.setPower(0.1);
            robot.clawServo.setPower(0.9);
            sleep(700);
            robot.clawServo.setPower(0.9);
            robot.armServo.setPower(0.9);
            sleep(1000);
            robot.slideMotor.setPower(0.9);
            robot.armServo.setPower(0.5);
            bad.strafe(-20);
            sleep(800);
            bad.turn(148);
            sleep(1750);
            bad.drive(99);
            sleep(2500);
            bad.turn(10);
            sleep(1000);
            robot.slideMotor.setPower(0.05);
//            bad.drive(8);
//            sleep(225);
            robot.clawServo.setPower(0);
            sleep(100);
            robot.armServo.setPower(-0.5);
            sleep(300);
            robot.armServo.setPower(0.95);
            sleep(1500);
            robot.slideMotor.setPower(-0.9);
            bad.drive(-20);
            sleep(400);
            bad.turn(-10000);   // 85
            sleep(1000);
            bad.drive(10000); // end: 330      close: 250
            robot.slideMotor.setPower(0);
        }
    }
}
