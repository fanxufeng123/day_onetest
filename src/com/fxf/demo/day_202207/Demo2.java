package com.fxf.demo.day_202207;

import java.net.InetAddress;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo2 {
    public static void main(String[] args) {
        try {
            //File file = new File("hello.txt");
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");

            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);

            //获取本地ip
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);

            //getHostName()
            System.out.println(inet4.getHostName());
            //getHostAddress()
            System.out.println(inet4.getHostAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }
        Hashtable ab = new Hashtable();
        Map map = new ConcurrentHashMap();

    }
}
