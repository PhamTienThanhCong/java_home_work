package Bai_02;

public class CayTimKiemNhiPhan {
    public int Key;
    public CayTimKiemNhiPhan left,right;
    
    public CayTimKiemNhiPhan(int key){
        this.Key = key;
        this.left = null;
        this.right = null;
    }

    public static CayTimKiemNhiPhan addNode(CayTimKiemNhiPhan root,int node){
        if (root == null) {
            root = new CayTimKiemNhiPhan(node);
            return root;
        }

        if (root.Key > node){
            root.left = addNode(root.left,node);
        }else if (root.Key < node){
            root.right = addNode(root.right,node);
        }
        return root;
    }

    //Duyệt trung thứ tự (In-order Traversal)
    public void InOrDerTraversal (CayTimKiemNhiPhan Node){
        if (Node != null){
            InOrDerTraversal(Node.left);
            System.out.print(Node.Key+" ");
            InOrDerTraversal(Node.right);
        }
    }

    // Duyệt tiền thứ tự (Pre-order Traversal)
    public void PreOrDerTraversal (CayTimKiemNhiPhan Node){
        if (Node != null){
            System.out.print(Node.Key+" ");
            PreOrDerTraversal(Node.left);
            PreOrDerTraversal(Node.right);
        }
    }

    // Duyệt hậu thứ tự (Post-order Traversal)
    public void PostOrDerTraversal (CayTimKiemNhiPhan Node){
        if (Node != null){
            PostOrDerTraversal(Node.left);
            PostOrDerTraversal(Node.right);
            System.out.print(Node.Key+" ");
        }
    }

    public static void main(String[] args) {
        CayTimKiemNhiPhan Node = new CayTimKiemNhiPhan(25);

        Node = addNode(Node, 15);
        Node = addNode(Node, 50);
        Node = addNode(Node, 10);
        Node = addNode(Node, 22);
        Node = addNode(Node, 35);
        Node = addNode(Node, 70);
        Node = addNode(Node, 4);
        Node = addNode(Node, 12);
        Node = addNode(Node, 18);
        Node = addNode(Node, 24);
        Node = addNode(Node, 31);
        Node = addNode(Node, 44);
        Node = addNode(Node, 66);
        Node = addNode(Node, 90);

        System.out.print("\nDuyệt tiền thứ tự: ");
        Node.PreOrDerTraversal(Node);
        System.out.print("\nDuyệt Trung thứ tự: ");
        Node.InOrDerTraversal(Node);
        System.out.print("\nDuyệt hậu thứ tự: ");
        Node.PostOrDerTraversal(Node);
    }
    
}
