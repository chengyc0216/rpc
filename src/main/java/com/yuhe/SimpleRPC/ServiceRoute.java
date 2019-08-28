package com.yuhe.SimpleRPC;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ServiceRoute {
    public static Map<String,String> servicesMap = new HashMap<>();

    public ServiceRoute()
    {
        ClassWays classWays=new ClassWays();
        Class[] argumentsType={String.class};
        classWays.setArgumentsType(argumentsType);
        classWays.setClassname("com.yuhe.SimpleRPC.SayHelloServiceImpl");
        classWays.setMethod("sayHello");
        classWays.setIp("127.0.0.1");
        classWays.setPort(1234);

        JSONObject jsonObject = new JSONObject(classWays);

//        JsonSerializer<Class[]> jsonSerializer = new JsonSerializer<Class[]>() {
//            @Override
//            public JsonElement serialize(Class[] src, Type typeOfSrc, JsonSerializationContext context) {
//
//                return null;
//            }
//        };

//        Gson gson = new GsonBuilder().registerTypeAdapter(ClassWays.class, jsonSerializer).create();

        servicesMap.put("SayHello", jsonObject.toString());
    }
}
