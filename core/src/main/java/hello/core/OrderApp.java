package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderServiceImpl;
import hello.core.order.OrderServise;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memeberService = new MemberServiceImpl();
        OrderServise orderServise = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memeberService.join(member);

        Order order = orderServise.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);

        System.out.println("order.calculatePrice = " + order.calculatePrice());

    }
}
