package service.impl;

import service.IsayHello;

public class SayChinese implements IsayHello {
    @Override
    public void say() {
        System.out.println("儿子你好");
    }
}
