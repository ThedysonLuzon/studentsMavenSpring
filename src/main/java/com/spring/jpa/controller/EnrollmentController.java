package com.spring.jpa.controller;

import com.spring.jpa.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnrollmentController {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @RequestMapping("/checkout")
    public String getCheckoutPage(){
        return "checkoutpage";
    }

    @RequestMapping("/enroll")
    public String getEnrollmentPage(){
        return "confirmationpage";
    }

    @RequestMapping("paymentsuccess")
    public String getPaymentSuccessPage(){
        return "paymentsuccess";
    }


}
