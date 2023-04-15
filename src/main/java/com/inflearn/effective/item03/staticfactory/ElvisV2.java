package com.inflearn.effective.item03.staticfactory;

/**
 * @author bumblebee
 */
// 코드 3-2 정적 팩터리 방식의 싱글턴
public class ElvisV2 implements Singer{

    private static final ElvisV2 INSTANCE = new ElvisV2();
    private ElvisV2() {}
    public static ElvisV2 getInstance() {
        return INSTANCE;
    }

    public void LeaveTheBuilding() {
        System.out.println("Whoa baby, i`m outta here!");
    }

    public static void main(String[] args) {
        ElvisV2 elvisV2 = ElvisV2.getInstance();
        elvisV2.LeaveTheBuilding();
    }

    @Override
    public void sing() {
        System.out.println("my way~~");
    }
}
