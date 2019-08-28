package com.yuhe.SimpleRPC.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NIOServer {
    private Selector selector;

    public void initServer(int port) throws IOException {
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.configureBlocking(false);
        serverChannel.socket().bind(new InetSocketAddress(port));

        this.selector = Selector.open();
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);

    }

    public void listen() throws IOException {
        while (true) {

            Iterator<SelectionKey> ite  = this.selector.selectedKeys().iterator();

            while (ite.hasNext()) {
                SelectionKey key = ite.next();
                ite.remove();
                if (key.isAcceptable()) {
                    ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.write(ByteBuffer.wrap("qweqweqwe".getBytes()));
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else {
                    if (key.isReadable()) {
                        ReadUtils.read(key);
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        NIOServer server = new NIOServer();
        server.initServer(8000);
        server.listen();
    }
}
