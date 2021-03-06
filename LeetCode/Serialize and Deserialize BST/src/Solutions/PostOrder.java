package Solutions;

public class PostOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        serialize(root.left, sb);
        serialize(root.right, sb);
        sb.append(Integer.valueOf(root.val)).append(" ");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }
        String[] nodes = data.split(" ");
        int[] index = new int[]{nodes.length - 1};
        return deserialize(nodes, index, Integer.MIN_VALUE);
    }

    private TreeNode deserialize(String[] nodes, int[] index, int min) {
        if (index[0] < 0 || Integer.valueOf(nodes[index[0]]) <= min) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(nodes[index[0]--]));
        root.right = deserialize(nodes, index, root.val);
        root.left = deserialize(nodes, index, min);
        return root;
    }
}
