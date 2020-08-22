import java.time.ZonedDateTime;

/**
 * @author gm-hacker
 * @create 2020-08-22 13:51
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2020-08-22T13:51:31.583+08:00[Asia/Shanghai]
    }
}
