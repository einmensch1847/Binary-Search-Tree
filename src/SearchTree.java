public class SearchTree {
    private TreeNode root;

    public boolean insert(Object item) {
        if (IsEmpty()) {
            root = new TreeNode(item);
            return true;
        } else {
            return root.insertNode(item);
        }
    }

    public boolean IsEmpty() {
        return root == null;
    }

    public boolean Search(Object item) {
        return SearchHelper(root, item);
    }

    private boolean SearchHelper(TreeNode root, Object target) {
        if (root == null) {
            return false;
        } else if (target.toString().compareTo(root.info.toString()) == 0) {
            return true;
        } else if (target.toString().compareTo(root.info.toString()) < 0) {
            return SearchHelper(root.left, target);
        } else if (target.toString().compareTo(root.info.toString()) > 0) {
            return SearchHelper(root.right, target);
        }
        return false;
    }

    public void Display() {
        DisplayHelper(root);
    }

    private void DisplayHelper(TreeNode root) {
        if(!IsEmpty()) {
            if (root != null) {
                DisplayHelper(root.left);
                System.out.println(root.info);
                DisplayHelper(root.right);
            }
        }
    }

    public int GetDepth(){
        return DepthHelper(root);
    }
    private int DepthHelper(TreeNode root){
        if (root == null) return 0;
        int left_Depth = DepthHelper(root.left);
        int right_Depth = DepthHelper(root.right);
        return Math.max(left_Depth, right_Depth) + 1;
    }

    public int GetLength(){
        return LengthHelper(root);
    }
    private int LengthHelper(TreeNode root){
        if (root == null) return 0;
        int left_Len = LengthHelper(root.left);
        int right_Len = LengthHelper(root.right);
        return left_Len + right_Len + 1 ;
    }
    public int GetWidth() {

        int MaxWidth = 0;
        int depth = GetDepth();
        for (int i = 1; i <= depth; i++) {
            int LevelWidth = GetWidthInLevel(root, i);
            MaxWidth = Math.max(MaxWidth, LevelWidth);
        }
        return MaxWidth;
    }

    private int GetWidthInLevel(TreeNode node , int Level){
        if(node == null) return 0;
        if(Level == 1) return 1;
        return GetWidthInLevel(node.left,Level-1) + GetWidthInLevel(node.right,Level-1);
    }

    public void Remove(Object item) {
        root = RemoveHelper(root, item);
    }

    private TreeNode RemoveHelper(TreeNode node, Object item) {
        if (node == null) {
            return null;
        }

        if (item.toString().compareTo(node.info.toString()) < 0) {
            node.left = RemoveHelper(node.left, item);
        } else if (item.toString().compareTo(node.info.toString()) > 0) {
            node.right = RemoveHelper(node.right, item);
        } else {

            if (node.left == null && node.right == null) {
                return null;
            }

            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            TreeNode minNode = findMin(node.right);
            node.info = minNode.info;
            node.right = RemoveHelper(node.right, minNode.info);
        }

        return node;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


}



