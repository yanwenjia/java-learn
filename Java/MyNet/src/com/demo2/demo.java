package com.demo2;

import java.io.IOException;
import java.net.*;

public class demo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "Hello".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("SKY-20191225BFP");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);

        ds.send(dp);

        ds.close();
    }
}
