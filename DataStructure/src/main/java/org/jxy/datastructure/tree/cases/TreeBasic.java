package org.hebut.scse.datastructure.tree.cases;

import org.hebut.scse.datastructure.tree.TreeNode;
import org.hebut.scse.datastructure.tree.build.BinSortTree;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 求二叉排序树的深度，后序，层序
 * 求二叉排序树的节点总数
 * 求二叉排序树的叶子节点数量
 *  求二叉排序树的平衡性：后序
 */
public class TreeBasic {
    /**
     * 求二叉排序树的深度
     * 递归：后序遍历
     */
    public static int getTreeDepth(TreeNode root){
        if(root==null)
            return 0;
       int dl=getTreeDepth(root.left);
       int dr=getTreeDepth(root.right);
       return (dl>dr?dl:dr)+1;

    }
    //非递归法：层序遍历
    public static int getDepth(TreeNode root){
        if(root==null)
            return 0;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int depth=0;
        while (!queue.isEmpty()){
            depth++;
            int i=0;
            while (i<queue.size()){//遍历当前层的所有节点，加入下层所有节点
                TreeNode c = queue.poll();
                if(c.left!=null)
                    queue.offer(c.left);
                if(c.right!=null)
                    queue.offer(c.right);
                i++;
            }
        }
        return depth;
    }
    /**
     * 求二叉排序树的节点个数
     * 递归：后序遍历
     */
    public static int getTreeNodeNum(TreeNode root){
        if(root==null)
            return 0;
        int nl=getTreeNodeNum(root.left);
        int nr=getTreeNodeNum(root.right);
        return nr+nl+1;

    }
    //非递归法：层序遍历
    public static int getNodeNum(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int num=0;
        while (!queue.isEmpty()){
            num++;
            TreeNode c = queue.poll();
            if(c.left!=null)
                queue.offer(c.left);
            if(c.right!=null)
                queue.offer(c.right);
        }
        return num;
    }
    /**
     * 求二叉排序树的叶子节点个数
     * 递归：后序遍历
     */
    public static int getLeafTreeNodeNum(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return 1;
        int nl=getTreeNodeNum(root.left);
        int nr=getTreeNodeNum(root.right);
        return nr+nl;//不算根节点
    }

    /**
     * 二叉树的平衡性；后序遍历多次
     */
    public static boolean isBalanced(TreeNode root){
        if(root==null)
            return true;
        int dl=getDepth(root.left);
        int dr=getDepth(root.right);
        if(Math.abs(dl-dr)>1)
            return false;
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        return left&&right;
    }
    /**
     * 二叉树的平衡性；后序遍历一次
     * 后序遍历保证子树为平衡时在判断母树是否平衡
     */
    class Depth{
        public int depth;
    }
    public static boolean isBalanced(TreeNode root,Depth d){
        if(root==null) {//空节点为真
            d.depth=0;
            return true;
        }
        Depth dl=new TreeBasic().new Depth(),dr=new TreeBasic().new Depth();
        boolean left=isBalanced(root.left,dr);
        boolean right=isBalanced(root.right,dl);
        if(left&&right){
            int diff=Math.abs(dl.depth-dr.depth);
            if(diff<=1){
                d.depth=1+(dr.depth>dl.depth?dr.depth:dl.depth);
                return true;
            }
        }
        return false;
    }
    /**
     * 二叉树的平衡性；后序遍历一次
     * 非递归
     */
    public static boolean isBalancedTree(TreeNode root){
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode c=null,p=null;
        s.push(root);
        int depth;
        while (!s.isEmpty()){
            c=s.peek();
            if((c.left==null&&c.right==null)||(p!=null&&(p==c.left||p==c.right))){
                if(c.left==null&&c.right==null){
                    c.lMaxDis=0;
                    c.rMaxDis=0;
                }
                if(c.left!=null)
                    c.lMaxDis=Math.max(c.left.lMaxDis,c.left.rMaxDis)+1;
                if(c.right!=null)
                    c.rMaxDis=Math.max(c.right.lMaxDis,c.right.rMaxDis)+1;
                int diff=Math.abs(c.lMaxDis-c.rMaxDis);
                if(diff>1)
                    return false;
                s.pop();
                p=c;
            }else {//栈的特性先进后出，为了保证每次访问从左边开始，所以先让右子树入栈
                if(c.right!=null)
                    s.push(c.right);
                if(c.left!=null)
                    s.push(c.left);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = BinSortTree.buildTree(new int[]{5, 3, 7, 1, 4, 6, 8,9});
//        System.out.println(getTreeDepth(root));
//        System.out.println(getTreeNodeNum(root));
//        System.out.println(isBalanced(root));
        System.out.println(isBalanced(root,new TreeBasic().new Depth()));
        System.out.println(isBalancedTree(root));
    }
}
