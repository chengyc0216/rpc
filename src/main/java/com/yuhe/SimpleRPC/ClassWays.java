package com.yuhe.SimpleRPC;

public class ClassWays {
    String classname;//类名

    String method;//方法

    Class[] argumentsType;//参数类型

    String ip;//服务的ip地址

    int port;//服务的端口

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Class[] getArgumentsType() {
        return argumentsType;
    }

    public void setArgumentsType(Class[] argumentsType) {
        this.argumentsType = argumentsType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
