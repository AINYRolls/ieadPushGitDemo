import java.util.HashMap;

/**
 * @author:rollsyang
 * @date:2022/3/24:22:40:2022
 */
public class debugerTest{
     public static void main(String[] args) {

          for (int i = 0; i < 100; i++) {
               /*条件断点
               * 右键断点即可
               * **/
               System.out.println(i);
          }

          HashMap<String,String> map = new HashMap<>();
          map.put("name","Tom");
          map.put("age","21");
          map.put("adress","BA");
          map.put("good","top");

          int age = Integer.parseInt(map.get("age")) ;
          System.out.println(age);

          System.out.println(map);
          map.remove("good");
          System.out.println(map);

     }



}
