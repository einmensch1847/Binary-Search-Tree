public class Main {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree();
        TreeNode root = new TreeNode(1);
        if (root.insertNode(111)) {
            System.out.println("\" 111 \" can Inserted Node\n");
        } else {
            System.out.println("\" 111 \" can Not Inserted Node\n");
        }


        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        tree.insert(111);


        System.out.println("Tree elements (in-order):");
        tree.Display();

        if (root.insertNode(50)) {
            System.out.println("\n\" 50 \" can Inserted Node");
        } else {
            System.out.println("\n\" 50 \" can Not Inserted Node");
        }

        System.out.println("\nSearching for 111: " + tree.Search(111));
        System.out.println("Searching for 100: " + tree.Search(100) + "\n");

//      *****************************************************************************************************

        System.out.println("\nDepth of tree: " + tree.GetDepth());
        System.out.println("Length of tree (number of nodes): " + tree.GetLength());
        System.out.println("Width of tree: " + tree.GetWidth());
        System.out.println("\nBefore Remove \" 111 \" : ");
        tree.Remove(111);
        tree.Display();
    }
}
