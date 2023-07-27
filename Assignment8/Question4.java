class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class Question4 {
    
        public static TreeNode str2tree(String s) {
            if (s.isEmpty()) {
                return null;
            }
    
            int firstParen = s.indexOf("(");
    
            if (firstParen == -1) { // The string contains only an integer (root node).
                return new TreeNode(Integer.parseInt(s));
            }
    
            // Extract the root value from the substring before the first parenthesis.
            int rootVal = Integer.parseInt(s.substring(0, firstParen));
    
            // Find the corresponding closing parenthesis for the left child node.
            int start = firstParen;
            int openParenCount = 0;
            for (int i = start; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    openParenCount++;
                } else if (s.charAt(i) == ')') {
                    openParenCount--;
                }
    
                if (openParenCount == 0) {
                    start = i + 1;
                    break;
                }
            }
    
            // Extract the substring representing the left child.
            String leftSubtree = s.substring(firstParen + 1, start - 1);
    
            // Find the corresponding closing parenthesis for the right child node.
            int end = s.length() - 1;
            openParenCount = 0;
            for (int i = end; i >= start; i--) {
                if (s.charAt(i) == ')') {
                    openParenCount++;
                } else if (s.charAt(i) == '(') {
                    openParenCount--;
                }
    
                if (openParenCount == 0) {
                    end = i - 1;
                    break;
                }
            }
    
            // Extract the substring representing the right child.
            String rightSubtree = s.substring(start, end + 1);
    
            // Recursively construct the left and right subtrees.
            TreeNode leftChild = str2tree(leftSubtree);
            TreeNode rightChild = str2tree(rightSubtree);
    
            // Create the root node and attach the left and right children.
            TreeNode root = new TreeNode(rootVal);
            root.left = leftChild;
            root.right = rightChild;
    
            return root;
        }
    
        public static void main(String[] args) {
            String s = "4(2(3)(1))(6(5))";
            TreeNode root = str2tree(s);
            // You can now traverse the tree (e.g., using pre-order traversal) to check the constructed binary tree.
        }
    }
    

