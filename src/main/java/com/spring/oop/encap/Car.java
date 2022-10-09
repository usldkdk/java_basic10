package com.spring.oop.encap;

public class Car {

    //필드
    final String model; // 모델명
    private int currentSpeed; // 현재 속도
    private int limitSpeed; // 최대 제한 속도

    //생성자
    Car(String model, int limitSpeed) {
        this.model = model;
//        this.currentSpeed = 0;
        this.limitSpeed = limitSpeed;
    }

    //시동 버튼 누르기
    public void on() {
        injectOil();
        injectGas();
        moveCylinder();
        powerOn();
    }

    private void powerOn() {
        System.out.println("시동 버튼을 눌렀습니다.");
    }

    private void injectOil() {
        System.out.println("엔진오일을 분사합니다.");
    }

    private void injectGas() {
        System.out.println("가솔린을 분사합니다.");
    }

    private void moveCylinder() {
        System.out.println("실린더를 작동합니다.");
    }

    // 속도를 올리는 기능
    public void accelerator() {
        System.out.println("악셀을 밟았습니다.");

        if (this.currentSpeed >= 300) {
            System.out.println("이제 못밟습니다~");
            return;
        }
        this.currentSpeed += 50;
        System.out.println("현재속도: " + currentSpeed);
    }

}
