package com.inflearn.effective.item01;

/**
 * @author bumblebee
 */
public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    /*
    * 생성자 시그니처가 겹처서 사용할 수 없다.
    *
    * */
//    public Order(Product product, boolean prime) {
//        this.product = product;
//        this.prime = prime;
//    }
//
//    public Order(Product product, boolean urgent) {
//        this.product = product;
//        this.urgent = urgent;
//    }

    /*
    * 정적 팩토리 메소드를 사용해서 이름으로 표현을 하자(장점 1)
    * 인스턴스를 만드어주는 역할을 한다.
    * 사용용도 : 생성자의 시그니처가 겹치는 경우에 사용하면 좋을 것 같다.
    *
    * 추상 팩토리 패턴, 팩토리 메소드 패턴이랑 젼혀 다르다.
     */
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

}
