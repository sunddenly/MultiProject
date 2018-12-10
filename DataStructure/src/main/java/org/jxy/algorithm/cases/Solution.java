package org.hebut.scse.algorithm.cases;

import java.util.ArrayList;

/**
 * Created by jxy on 2016/9/27.
 */
public class Solution {

    public static void main(String[] args) {
//        System.out.println(continuousSequence(100));
        int[] a ={-5,-4,-3,-2,-1,0,1,2,3,4,5};
        System.out.println(minAbs(a));
    }
    /**
     * 求和为s的连续有序段个数
     * 1+2+3+4=10
     * 只有一个
     */
    public static ArrayList<ArrayList<Integer>> continuousSequence(int s){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(s<3)
            return result;
        int l=1,h=2,c=(1+h);
        while(l<(1+s)/2){
            if(c==s){
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int i=l;i<=h;i++)
                    list.add(i);
                c-=l;
                l++;
                result.add(list);
            }else if(c<s){
                h++;
                c+=h;
            }else {
                c-=l;
                l++;
            }
        }
        return result;
    }
    /**
     * 求解有序数组中绝对值最小数
     */
    public static int minAbs(int[] a){
        if(a[0]>=0)
            return a[0];
        if(a[a.length-1]<=0)
            return a[a.length-1];
        int l=0,h=a.length-1,mid=0;
        while (l<h){
            mid=(l+h)/2;
            if(a[mid]==0){
                return 0;
            }else if(a[mid]>0){
                if(a[mid-1]==0)
                    return 0;
                else if(a[mid-1]>0)
                    h=mid-1;
                else
                    break;
            }else {
                if(a[mid+1]==0)
                    return 0;
                else if(a[mid+1]<0)
                    l=mid+1;
                else
                    break;
            }
        }
        if(a[mid]>0)
            return Math.min(a[mid],Math.abs(a[mid-1]));
        else
            return Math.min(a[mid+1],Math.abs(a[mid]));
    }
}
