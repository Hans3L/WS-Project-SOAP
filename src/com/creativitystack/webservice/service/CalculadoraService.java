package com.creativitystack.webservice.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws-project/calculator")
public interface CalculadoraService {

    public abstract int addition(int num1,int num2);

    public abstract String sayHello(String name);
}
