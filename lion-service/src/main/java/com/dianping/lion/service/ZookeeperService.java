package com.dianping.lion.service;

public interface ZookeeperService {

    public void create(String path, String data) throws Exception;

    public void delete(String path) throws Exception;

    public String get(String path) throws Exception;

    public void set(String path, String data) throws Exception;

}
