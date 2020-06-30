package com.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class R {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        ds.receive(dp);

        byte[] datas = dp.getData();
        String dataString = new String(datas);
        System.out.println(dataString);

        ds.close();
    }
}
