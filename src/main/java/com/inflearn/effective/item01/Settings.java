package com.inflearn.effective.item01;

/**
 * @author bumblebee
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    /*
    * 생성자를 통해서 인스턴스를 만들면 통제가 불가능하다.
    *
    * 정적 팩터리 메소드 (장점2)
    * 미리 만들어 놓은 인스턴스를 리턴할 수 있다.
    * Settings 인스턴스를 가져갈 수 있는 방법이 오로지 정적 팩터리 메서드를 이용해서 가져가는 방법밖에 없다.
    * 이렇게 하면 여러개의 인스턴스를 생성할 수 없다.
    * 생성자로는 인스턴스를 컨트롤 할 수 없다. Settings 같은 경우는 객체 생성을 자기 자신이 컨트롤하겠다는 의미
    *
    * */
    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance() {
        return SETTINGS;
    }


}
