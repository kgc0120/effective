package com.inflearn.effective.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author bumblebee
 *
 * 생성자로 여러 인스턴스 만들기
 */
public class ElvisReflection {

    public static void main(String[] args) {
        try {
            Constructor<Elvis> defaConstructor = Elvis.class.getDeclaredConstructor();
            defaConstructor.setAccessible(true);
            Elvis.INSTANCE.sing();
            Elvis elvis1 = defaConstructor.newInstance();
            Elvis elvis2 = defaConstructor.newInstance();
            System.out.println(elvis1 == elvis2);
            System.out.println(elvis1 == Elvis.INSTANCE);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
