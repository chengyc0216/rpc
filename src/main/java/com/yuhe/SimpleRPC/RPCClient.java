package com.yuhe.SimpleRPC;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class RPCClient {

    public static void main(String[] arg) throws Exception {
        new ServiceRoute();
        String serviceJson = ServiceRoute.servicesMap.get("SayHello");
        JSONObject jsonObject = new JSONObject(serviceJson);
        String classname= (String) jsonObject.get("classname");
        String method= (String) jsonObject.get("method");
        String ip = (String) jsonObject.get("ip");
        Integer port = (Integer) jsonObject.get("port");
        JSONArray argTypes = (JSONArray) jsonObject.get("argumentsType");

        List<Class<?>> classes = new ArrayList<>();
        for (Object type : argTypes) {
            String typeName = (String) type;
            typeName = typeName.split(" ")[1];
            Class<?> clzz = Class.forName(typeName);
            classes.add(clzz);
        }
        Class<?>[] argTs = classes.toArray(new Class[0]);

        Object[] arguments={"intsmaze"};

        Socket socket=new Socket(ip,port);

        ObjectOutputStream output=new ObjectOutputStream(socket.getOutputStream());

        output.writeUTF(classname);
        output.writeUTF(method);
        output.writeObject(argTs);
        output.writeObject(arguments);

        ObjectInputStream input=new ObjectInputStream(socket.getInputStream());
        Object result=input.readObject();
        System.out.println(result);
        socket.close();

    }
}
