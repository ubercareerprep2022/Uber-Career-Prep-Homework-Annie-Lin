public class BinarySearchTreePhoneBook implements Ex5 {

    public int size(Node node)
    {
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }

    public void insert(int key) {

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

    public boolean find_helper(int key) {

            if (root == null)
                return false;
        
            if (root.key == key)
                return true;
        
            boolean left_side = find(root.left, key);
        
            if(left_side) return true;
        
            boolean right_side = find(root.right, key);
 
            return right_side;
        
        }

}
