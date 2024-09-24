package recursive;

class Node {
    int data;
    queue.Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class 이진트리순회_DFS {
    static queue.Node root;

    public static void DFS (queue.Node node) {
        if(node == null) return;
        DFS(node.lt);
        DFS(node.rt);
        System.out.print(node.data + " ");


    }

    public static void main(String[] args) {

        root = new queue.Node(1);
        root.lt = new queue.Node(2);
        root.rt = new queue.Node(3);
        root.lt.lt = new queue.Node(4);
        root.lt.rt = new queue.Node(5);
        root.rt.lt = new queue.Node(6);
        root.rt.rt = new queue.Node(7);

        DFS(root);  // 루트를 기점으로 탐색을 시작

    }
}
