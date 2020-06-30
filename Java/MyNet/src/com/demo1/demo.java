package com.demo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("SKY-20191225BFP");

        String hostName = address.getHostName();

        String hostAddress = address.getHostAddress();

        System.out.println(hostName);
        System.out.println(hostAddress);
    }
}
