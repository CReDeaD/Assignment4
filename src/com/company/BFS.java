package com.company;


import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class BFS {
    static class Node {
        int data;
        Node left, right;
        boolean visited;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.visited = false;
        }
    }

    public void bfs() {
        List<Node> list = new ArrayList<>();
        Node node;
        node = list.get(0);
        list.add(node);
        while (!list.isEmpty()) {
            node = list.get(0);
            if (node.left != null) {
                int index = list.size();
                list.add(index, node.left);
            }
            if (node.right != null) {
                int index = list.size();
                list.add(index, node.right);
            }
        }
    }
}
