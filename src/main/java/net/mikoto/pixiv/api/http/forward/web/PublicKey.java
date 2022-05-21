package net.mikoto.pixiv.api.http.forward.web;

import net.mikoto.pixiv.api.annotation.HttpApiPackage;

/**
 * @author mikoto
 * @date 2022/5/21 16:19
 */
@HttpApiPackage("net.mikoto.pixiv.api.http.forward")
public interface PublicKey {
    /**
     * Get the public key.
     *
     * @return The public key.
     */
    String publicKeyHttpApi();
}
