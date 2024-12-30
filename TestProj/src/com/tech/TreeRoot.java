package com.tech;

public class TreeRoot {

    public int data;
    public TreeRoot left,right;
	@Override
	public String toString() {
		return "TreeRoot [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Tree tree=new Tree();
         tree.insert(50);
         tree.insert(70);
         tree.insert(40);
         tree.insert(20);
         // calling traversing method
         tree.callInorder();
        
        
      
         
	}
}

/*
 *         ( 50 )
 *         /   \
 *      ( 40 ) ( 70)   
 *       /
 *     (20)  
 * 
 */

// The time complexity of Binary search tree is O(h) it is very effective if we want to search element in tree
// The time complexity of the binary search algorithm is O(log n). 
// The best-case time complexity would be O(1) when the central index would directly match the desired value.
/*
 * Average case: Average case time complexity is same as best case so the time complexity 
 * in deleting an element in binary search tree is O(log N).
 *  Note: Average Height of a Binary Search Tree is 4.31107 ln(N) - 1.9531 lnln(N) + O(1) that is O(logN)
 *  
 *  */
	class Tree{
		
		@Override
		public String toString() {
			return "Tree [node=" + node + ", root=" + root + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		public TreeRoot node;
		public TreeRoot root;
		public void insert(int data) {
			 node=new TreeRoot();
			 node.data=data; node.left=null; node.right=null;
			if(root==null) {
				root=node;
			}else {
				TreeRoot current=root;TreeRoot parent=root;
				while(current != null) {
					parent=current;
					if(node.data > current.data) {
						current=current.right;
					}else {
						current=current.left;
					}
				}
				if(node.data > parent.data) {
					    parent.right=node;
					  //  System.out.println("element inserted at right  : "+node.data);
				}else {
					parent.left=node;
				//	System.out.println("element inserted at left : "+node.data);
				}
			}
			
		System.out.println(" node values "+root);
		
		}
		public void callInorder() {
			inorder(root);
			// finding the length of tree
			System.out.println("finding length of tree : "+length(root));
			preorder(root);
			postorder(root);
			boolean b=search(root , 100);
			if(b) {
			//	System.out.println("found");
			}else {
				System.out.println(" not found ");
			}
			// call depth of tree
	        int depth =heightOfTree(root);
	         System.out.println(" depth of tree : "+depth);
			
			// delete a node from tree
		 TreeRoot rootMod = delete(root, 40);
		 System.out.println(" Tree node after deletion : "+40);
		 inorder(rootMod);
		 
		}
		// in order traversal by recurssively
		public void inorder(TreeRoot root) {
			TreeRoot r=root;
			if(root.left!=null) {
				r=root.left;
				inorder(r);
			}
			System.out.println("traversal data : "+root.data);
			if(root.right!=null) {
				r=root.right;
				inorder(r);
			}
		}
		// length of a tree
		int count=0;
		public int length(TreeRoot root) {
			if(root.left!=null) {
				length(root.left);
			}
			count++;
			if(root.right!=null) {
				length(root.right);
			}
			return count;
		}
		// preorder traversal
		public void preorder(TreeRoot root) {
			System.out.println(" preorder root data "+root.data);
			if(root.left!=null) {preorder(root.left);}
			if(root.right!=null) {preorder(root.right);}
		}
		// postorder
		public void postorder(TreeRoot root) {
			if(root.left!=null) {
				System.out.println("left");
				postorder(root.left);
				try {
				Thread.sleep(5000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				}
			if(root.right!=null) {
				System.out.println("right");
				postorder(root.right);
				}
			System.out.println(" postorder traversal tree : "+root.data);
		}
		// search 
		  public boolean search(TreeRoot root, int key) {
		 
			  if(root == null) {
				  return false;
			  }
			  if(root.data > key) {
				return  search(root.left,key);
			  }else if(root.data == key) {
					 System.out.println("found");
					 return true;
			   }
			  else  {
				 return search(root.right,key);
			  }
		  }
		  
		  // check depth of a tree
		  public int heightOfTree(TreeRoot root) {
			  int leftCount=0 ; int rightCount=0;
			  if(root == null) {
			  return 0;
			  }
					  leftCount=heightOfTree(root.left);
					  rightCount=heightOfTree(root.right);
			  
			 int maxCount =Math.max(leftCount, rightCount);
			  
			 return maxCount+1;
		  }
		  
		  public TreeRoot delete(TreeRoot root , int key) {
			  
			  if(root.data > key) {
				  root.left = delete(root.left,key);
			  }else if(root.data < key) {
				  root.right = delete(root.right,key);
			  }else {
				  // case where we found node data equal to key
				  // case 1 if right node null and left node is null
				  if(root.left == null && root.right == null) {
					  return null;
				  }
				// case 2 if left node null	  
				  if(root.left == null) {
					  return root.right;
				  // case 3 if right node null	  
				  }else if(root.right == null) {
					 return root.left; 
				 // case 4 	 
				  }else {
					  // case where deletion node having both child left child and right child
					     TreeRoot   rightChildLeftSmallEl=inorderSuccessor(root.right);
					     root.data=rightChildLeftSmallEl.data;
					     // now delete smallEl data from left sub tree which we replaced data in Sub tree to make new root of subtree
					     root.right=delete(root.right,rightChildLeftSmallEl.data);
				  }
			  }
			  
			  return root;
		  }
		  
		  // method for finding smallest element in left sub tree of right child  by passing right child sub tree as root
		  public TreeRoot inorderSuccessor(TreeRoot root) { 
			  while(root.left!=null) {
				  root=root.left;
			  }
			  return root; 
		  }
	}
     

