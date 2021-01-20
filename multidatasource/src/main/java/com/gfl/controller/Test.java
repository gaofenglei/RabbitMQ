package com.gfl.controller;

public class Test {

    public static void main(String[] args) {
            a("bbbb");
    }

    public static void a(String msg){

        boolean ack=true;
        Exception e=null;
        try {
            if(msg.contains("aaa")){
                throw new RuntimeException("not null aaa");
            }
        }catch (Exception el){
            ack=false;
            e=el;
        }

        if(!ack){
            System.out.println("nck");
        }else {
            System.out.println("ack");
        }

    }

}
