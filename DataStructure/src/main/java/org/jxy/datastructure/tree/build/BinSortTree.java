package org.hebut.scse.datastructure.tree.build;

import org.hebut.scse.datastructure.tree.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by jxy on 2016/9/22.
 */
public class BinSortTree {

    public static TreeNode buildTree(int[] a){
        TreeNode root=null;
        for(int i=0;i<a.length;i++) {
            TreeNode newNode = new TreeNode(a[i]);
            if (root == null) {
                root = newNode;
            } else {
                TreeNode c = root, p;
                while (true) {
                    p = c;
                    if (a[i] < c.val) {
                        c = c.left;
                        if (c == null) {
                            p.left = newNode;
                            break;
                        }

                    } else {
                        c = c.right;
                        if (c == null) {
                            p.right = newNode;
                            break;
                        }

                    }
                }
            }
        }
        return root;
    }

    public static void main(String[] arg) {
        int[] a={5,3,7,1,4,6,8};
        TreeNode root = buildTree(a);
//        preTranverse(root);
//        System.out.println();
//        inTranverse(root);
//        System.out.println();
//        postTranverse(root);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        layerOrder(root);
       // System.out.println();
    }
    public static void preTranverse(TreeNode root){
        if(root!=null){
            System.out.print(root.val+",");
            preTranverse(root.left);
            preTranverse(root.right);
        }
    }
    public static void inTranverse(TreeNode root){
        if(root!=null){
            inTranverse(root.left);
            System.out.print(root.val+",");
            inTranverse(root.right);
        }
    }
    public static void postTranverse(TreeNode root){
        if(root!=null){
            postTranverse(root.left);
            postTranverse(root.right);
            System.out.print(root.val+",");
        }
    }
    public static void preOrder(TreeNode root){
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode c=root;
        while (c!=null||!s.isEmpty()){
            while (c!=null){
                System.out.print(c.val+",");
                s.push(c);
                c=c.left;
            }
            c=s.pop();
            c=c.right;
        }
    }
    public static void inOrder(TreeNode root){
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode c=root;
        while (c!=null||!s.isEmpty()){
            while (c!=null){
                s.push(c);
                c=c.left;
            }
            c=s.pop();
            System.out.print(c.val+",");
            c=c.right;
        }
    }

    /**
     * 后序遍历：左右根
     * 先访问叶子节点，叶子节点的访问顺序为从左到右
     */
    public static void postOrder(TreeNode root){
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode c=null,p=null;
        s.push(root);
        while (!s.isEmpty()){
            c=s.peek();
            if((c.left==null&&c.right==null)||(p!=null&&(p==c.left||p==c.right))){
                System.out.print(c.val+",");
                s.pop();
                p=c;
            }else {//栈的特性先进后出，为了保证每次访问从左边开始，所以先让右子树入栈
                if(c.right!=null)
                    s.push(c.right);
                if(c.left!=null)
                    s.push(c.left);
            }
        }
    }
    /**
     * 层序遍历
     */
    public static void layerOrder(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        TreeNode c;
        while (!queue.isEmpty()){
            c = queue.poll();
            System.out.print(c.val+",");
            if(c.left!=null)
                queue.offer(c.left);
            if(c.right!=null)
                queue.offer(c.right);
        }
    }
}


