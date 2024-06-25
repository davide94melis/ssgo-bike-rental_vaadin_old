package com.example.application.views.payment;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("Payment")
@Menu(icon = "line-awesome/svg/money-check-alt-solid.svg", order = 1)
@Route(value = "payment")
@AnonymousAllowed
public class PaymentView extends Composite<VerticalLayout> {

    public PaymentView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
