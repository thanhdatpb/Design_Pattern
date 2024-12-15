package com.thanhdatpb.creational.singleton;

public class ClientTest {
    public static void main(String[] args) {

        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("ThanhDat");
        System.out.println(eager1.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2.getName());
    }
}
