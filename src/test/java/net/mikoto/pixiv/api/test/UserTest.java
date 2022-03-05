package net.mikoto.pixiv.api.test;

import com.alibaba.fastjson.JSONObject;
import net.mikoto.pixiv.api.pojo.User;
import org.junit.jupiter.api.Test;

/**
 * @author mikoto
 * @date 2022/3/5 20:53
 */
public class UserTest {
    @Test
    public void testJson() throws IllegalAccessException {
        User user = new User();
        user.setUserKey("qwe");
        user.setUserName("qwe");
        user.setUserSalt("qwe");
        user.setUserPassword("qwe");
        user.setProfileUrl("qwe");
        user.setId(1);
        JSONObject jsonObject = user.toJsonObject();
        user.loadJson(jsonObject);
        assert user.toJsonObject().equals(jsonObject);
    }
}