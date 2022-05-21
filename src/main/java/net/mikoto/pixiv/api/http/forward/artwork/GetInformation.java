package net.mikoto.pixiv.api.http.forward.artwork;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.api.annotation.HttpApiPackage;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mikoto
 * @date 2022/3/12 21:23
 */
@HttpApiPackage("net.mikoto.pixiv.api.http.forward")
public interface GetInformation {
    String PARAM_KEY = "key=";
    String PARAM_ARTWORK_ID = "artworkId=";

    /**
     * Get information
     *
     * @param response  A http servlet response object.
     * @param key       The key of Pixiv-Forward.
     * @param artworkId The id of the artwork.
     * @return Result.
     * @throws Exception exceptions.
     */
    JSONObject getInformationHttpApi(HttpServletResponse response,
                                     String key,
                                     int artworkId) throws Exception;
}
