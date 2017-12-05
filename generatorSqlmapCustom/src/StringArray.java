import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StringArray  {
    public static void main(String[] args) {   
        /*String str = "(nihao),(henhao),(nichilema?),(chiguole)";
        String str2 = str.replaceAll("[( )]", "~");
        System.out.println(str2);*/
        
        String t="[[123456]]";
        String str3= t.replaceAll("[\\b]","");
        
        System.out.println(str3);
        
    }   
    
    //并集（set唯一性）
    public static String[] union (String[] arr1, String[] arr2){
        Set<String> hs = new HashSet<String>();
        for(String str:arr1){
            hs.add(str);
        }
        for(String str:arr2){
            hs.add(str);
        }
        String[] result={};
        return hs.toArray(result);
    }

    //交集(注意结果集中若使用LinkedList添加，则需要判断是否包含该元素，否则其中会包含重复的元素)
    public static String[] intersect(String[] arr1, String[] arr2){
        List<String> l = new LinkedList<String>();
        Set<String> common = new HashSet<String>();                  
        for(String str:arr1){
            if(!l.contains(str)){
                l.add(str);
            }
        }
        for(String str:arr2){
            if(l.contains(str)){
                common.add(str);
            }
        }
        String[] result={};
        return common.toArray(result);
    }
    //求两个数组的差集   
    public static String[] substract(String[] arr1, String[] arr2) {   
        LinkedList<String> list = new LinkedList<String>();   
        for (String str : arr1) {   
            if(!list.contains(str)) {   
                list.add(str);   
            }   
        }   
        for (String str : arr2) {   
            if (list.contains(str)) {   
                list.remove(str);   
            } 
        }   
        String[] result = {};   
        return list.toArray(result);   
    }   
}

	