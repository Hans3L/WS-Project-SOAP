package com.creativitystack.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.creativitystack.webservice.service.CalculadoraService", name = "calculadora")
public class CalculadoraServiceImp implements CalculadoraService {

    private String mesagge =  new String("Hola, ");

    @WebMethod
    public String sayHello(String name){
        return mesagge + name + ".";
    }

    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }
}
