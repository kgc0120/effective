package com.inflearn.effective.item03.enumtype;

/**
 * @author bumblebee
 */

    /*
    * 열거 타입 방식의 싱글턴 - 바랍직한 방법(리플랙션 방지 코드가 필요없다. 직렬화 역질렬화에도 안전하다.)
    * 리플렉션 API에서 생정자를 가져오지 못하게 막아져있다.
    * enum은 new로 생성할 수 없다.
    * */
public enum Elvis {

   INSTANCE;

   public void leaveTheBuilding(){
       System.out.println("기다려!");
   }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
