package hello.core.order;

public interface OrderServise {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
