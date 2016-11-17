package weibo4j.client.common;

import java.io.IOException;

import org.ksoong.weibo.Token;
import org.ksoong.weibo4j.Common;

public class ExampleOfGetProvince {

    public static void main(String[] args) throws IOException {

        Common common = new Common(Token.TOKEN);
        System.out.println(common.get_province("001"));
        System.out.println(common.get_province("001", "english"));
    }

}
