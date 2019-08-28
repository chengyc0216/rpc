package com.yuhe.SimpleRPC.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NIOClient {

    private Selector selector;

    public void initClient(int port) throws IOException {
        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);

        Selector selector = Selector.open();

        channel.connect(new InetSocketAddress(port));
        channel.register(selector, SelectionKey.OP_CONNECT);

    }

    public void listen() throws IOException {
        Iterator<SelectionKey> ite = this.selector.selectedKeys().iterator();
        while (ite.hasNext()) {
            SelectionKey key = ite.next();
            if (key.isAcceptable()) {


            }
        }

        selector.select();



    }


    public static void main(String[] args) throws IOException {
        NIOClient client = new NIOClient();
        client.initClient(8000);
        client.listen();
    }


}
