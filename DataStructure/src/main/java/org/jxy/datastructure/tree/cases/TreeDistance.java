package org.hebut.scse.datastructure.tree.cases;

import org.hebut.scse.datastructure.tree.TreeNode;
import org.hebut.scse.datastructure.tree.build.BinSortTree;
import org.junit.Test;

import java.util.Stack;

/**
 * Created by jxy on 2016/9/3.
 */
public class TreeDistance {
    //两点之间边的个数
    public static int maxLen=0;
    public static void findMaxDis(TreeNode root){
        if(root==null)
            return ;
        if(root.left==null)
            root.lMaxDis=0;
        if(root.right==null)
            root.rMaxDis=0;
        if(root.left!=null)
            findMaxDis(root.left);
        if(root.right!=null)
            findMaxDis(root.right);
        if(root.left!=null)
            root.lMaxDis=Math.max(root.left.lMaxDis,root.left.rMaxDis)+1;
        if(root.right!=null)
            root.rMaxDis=Math.max(root.right.lMaxDis,root.right.rMaxDis)+1;
        if((root.lMaxDis+root.rMaxDis)>maxLen)
            maxLen=(root.lMaxDis+root.rMaxDis);

    }
    //非递归法
    public static int findMaxDistance(TreeNode root){
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        TreeNode p=null,c;
        while (!s.isEmpty()){
            c=s.peek();
            if ((c.left==null&&c.right==null)||(p!=null&&(p==c.left||p==c.right))){
                if(c.left==null&&c.right==null){
                    c.lMaxDis=0;
                    c.rMaxDis=0;
                }
                if(c.left!=null)
                    c.lMaxDis=Math.max(c.left.lMaxDis,c.left.rMaxDis)+1;
                if(c.right!=null)
                    c.rMaxDis=Math.max(c.right.lMaxDis,c.right.rMaxDis)+1;
                if((c.lMaxDis+c.rMaxDis)>maxLen)
                    maxLen=c.lMaxDis+c.rMaxDis;
                s.pop();
                p=c;//记录访问，作为下次访问的参考
            }else {
                if(c.right!=null)
                    s.push(c.right);
                if(c.left!=null)
                    s.push(c.left);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        TreeNode root = BinSortTree.buildTree(new int[]{5, 3, 7, 1, 4, 6, 8});
//        findMaxDis(root);
//        System.out.println(maxLen);
        System.out.println(findMaxDistance(root));
    }
}
