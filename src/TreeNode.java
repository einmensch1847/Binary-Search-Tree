public class TreeNode {
    Object info ;
    TreeNode left , right ;

    public TreeNode(Object info) {
        this.info = info;
        left = null;
        right = null;
    }

    public boolean insertNode(Object item) {
        if (item.toString().compareTo(info.toString()) == 0) {
            return false;
        } else if (item.toString().compareTo(info.toString()) < 0) {
            if (left == null) {
                left = new TreeNode(item);
                return true;
            }
            else {
                return left.insertNode(item);
            }

        }
        else if (item.toString().compareTo(info.toString()) > 0) {
            if (right == null) {
                right = new TreeNode(item);
                return true;
            }
            else {
                return right.insertNode(item);

            }

        }
        return false;
    }
}
