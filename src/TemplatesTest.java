import java.util.Arrays;

/**
 * @author:rollsyang
 * @date:2022/3/15:21:46:2022
 */
public class TemplatesTest {
    private static final int p = 3;

public static void main(String[] args) {
//    2.sout
//    变形
//    soutp 输出参数
//    soutv 输出变量
//    soutm 输出方法
    System.out.println();
    System.out.println("args = " + Arrays.deepToString(args));
    int num =1;
    System.out.println("num = " + num);
    System.out.println("TemplatesTest.main");

//    fori    /iter

    String[] str = new String[]{"1","2","3","4"};
    for (int i = 0; i < str.length; i++) {
        System.out.println(str[i]); //写法 str[i].sout enter
        System.out.println("str[i] = " + str[i]);
    }
    for (String s : str) {
        System.out.println(s);
    }
//    list.for (元素)  /list.fori（下标）/list.forr(下标倒序)
//    ifn / inn  (if null )/(if not null)


}


}
