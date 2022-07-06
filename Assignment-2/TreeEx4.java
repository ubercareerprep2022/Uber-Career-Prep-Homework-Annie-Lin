public class Ex4 {

    public class BinarySearchTree {
        private Node root;
      
        /**
         * Inserts a key into this binary search tree.
         * If there are n nodes in the tree, then the average runtime of this method should be log(n).
         * 
         * @param key The key to insert.
         */
        public void insert(int key) {
          // Please implement this method.

          if(root == null){
            root = new Node(key);
          }
          
          if(key < root.key){
            root.left = insert(root.left, key);
          }
        
          if(key > root.key){
            root.right = insert(root.right, key);
          }
        }
      
        /**
         * Checks whether or not a key exists in this binary search tree.
         * If there are n nodes in the tree, then the average runtime of this method should be log(n).
         * 
         * @param key The key to check for.
         * @return true if the key is present in this binary search tree, false otherwise.
         */
        public boolean find(int key) {

            if (root == null)
                return false;
        
            if (root.key == key)
                return true;
        
            boolean left_side = find(root.left, key);
        
            if(left_side) return true;
        
            boolean right_side = find(root.right, key);
 
            return right_side;
        
        }
      
        public static class Node {
          public int key;
          public Node left;
          public Node right;
        }
      }
      
      
    
}
