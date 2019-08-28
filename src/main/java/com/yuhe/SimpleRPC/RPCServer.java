package com.yuhe.SimpleRPC;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class RPCServer {

    private void regiester() {

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        ServerSocket serverSocket = new ServerSocket(1234);
//
//        while (true) {
//
//            Socket socket = serverSocket.accept();
//            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
//
//            String classname=input.readUTF();
//            String methodName=input.readUTF();
//            Class<?>[] parameterTypes=(Class<?>[]) input.readObject();
//            Object[] arguments=(Object[]) input.readObject();
//
//            Class serviceclass=Class.forName(classname);
//            Object object = serviceclass.newInstance();
//            Method method=serviceclass.getMethod(methodName, parameterTypes);
//
//            Object result=method.invoke(object, arguments);
//
//            ObjectOutputStream output=new ObjectOutputStream(socket.getOutputStream());
//            output.writeObject(result);
//            socket.close();
//        }
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(RPCServer.class.getClassLoader());
        System.out.println(System.class.getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
    }
}
