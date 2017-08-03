package com.lgd.web.controller;

import org.aspectj.lang.annotation.Before;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.node.Node;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import static org.elasticsearch.node.NodeBuilder.*;

/**
 * Author : linguodong
 * Create : 2017/7/20
 * Update : 2017/7/20
 * Descriptions :
 */
public class testEs {
    private TransportClient client;
    private IndexRequest source;

    public static void main(String[] args) {
/*        //启动节点
        Node node = nodeBuilder().node();
        Client client = node.client();
        //关闭节点
        node.close();*/
    }

}
