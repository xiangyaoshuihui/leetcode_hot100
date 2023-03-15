import java.util.Arrays;

import java.util.List;
import java.util.ArrayList;

import java.util.Stack;
import java.util.Deque;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import java.util.Comparator;


public class a0_utils {

    public static void main(String[] args) {


    
    // 输入输出
        System.out.println("helloworld");

    // 基本数据类型，类型转换
        //char两字节 unicode
        char char1 = 'c';
        Character char2 = 'c';
        Character char3 = char1;
        char char4 = char2;

        int int1=1;
        Integer int2=int1;
        byte b1;short s2;long l4;

        float f1;double d2;

        boolean b2=false; //一字节

        //自动转换：弱->强   强制转换：强->弱
        //(byte<short),char<int<long<float<double
        int zop=1;
        short zzo=(short)zop;
        int zop1=zzo;
    
    //运算符
        //算数运算符+,-,*,/,%,++,--...,
        //关系运算符>...
        //逻辑运算符：|| ,&&,!,A^B(异或)
        //位运算符：&,|,^,~
        //赋值：+=..
        //条件：(a>b)? a:b
        //对象运算符:new,instanceof
        Integer ssoi=1;
        if(ssoi instanceof Integer);

    //语句
        int score=10;
        switch(score){
            case 1:
                //
                break;
            case 2:
                break;
            default:
                //
        }

        do{}while(false);


    // 数组
        int[] d1 = new int[10];
        int zzmm=d1.length;
        int[] d3;d3 = new int[10];
        int[] d22 = { 1, 2, 3 };
        

        int [][]ddwd=new int[10][10];
        int zzmm1=ddwd.length;
        zzmm1=ddwd[0].length;
        int [][]ddwd0=new int[2][];
        ddwd0[0]=new int[10];
        ddwd0[1]=new int[20];
        int [][]ddwd2={{1,2,3},{1,2}};

    // String，Stringbuffer(可变字符串)
        //字符串比较（==，equals）
        String sq1=new String("ads");
        String sq2=new String("ads");
        System.out.println(sq1==sq2);
        System.out.println(sq1.equals(sq2));
        String sq3="ads";
        String sq4="ads";
        System.out.println(sq3==sq4);

        //
        sq3.charAt(0);


        //StringBuffer(追加，插入，删除，替换，翻转)
        StringBuffer sb=new StringBuffer("asdasd");
        sb.append("_sjt");
        System.out.println(sb);
        sb.insert(sb.length(),"zzz");
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.replace(0, 1, "qwe");
        System.out.println(sb);
        sb.substring(0);
        sb.charAt(0);
        
        //char[],string,stringbuffer
        sb.toString();
        char []cc12=sq1.toCharArray();
        String sss00=new String(cc12);



        //其他类型转换到字符串，字符串转换到其他类型
        int ioplk=10;
        String.valueOf(ioplk);
        Integer.toString(ioplk);
        
        String hhh="100";
        Integer.parseInt(hhh);





    // 常用工具函数：
        // Math min,max,abs....

        //字符
        Character.isLetter('A');
        Character.isDigit('A');
        Character.isUpperCase('A');
        Character.isLowerCase('A');
        Character.toUpperCase('a');

        // Arrays (java.util.Arrays)
        int []zz={5,9,3,3,54,0,47};
        Arrays.sort(zz);
        Arrays.fill(zz,1);

        int[][] intervals=new int[10][2]; //自定义排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }});



    // 常用数据结构：queue，stack,priority_queue，set，map

        //list
        List<Integer> l123=new ArrayList<>(){{add(1);}};
        Integer []zzuy=new Integer []{1,2,3};
        l123.toArray(); //转成数组



        //Map

          //遍历
        Map<String,Integer> m=new HashMap<>();
        for(Map.Entry<String,Integer> entry : m.entrySet()){
            entry.getValue();
            entry.getKey();
        };





    // 父类，接口，抽象类

    // 重载
    }

}
