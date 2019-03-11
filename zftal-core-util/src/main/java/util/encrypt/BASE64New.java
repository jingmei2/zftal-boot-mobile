package util.encrypt;/**
 * Created by  Administrator on 2019-02-12 10:52 AM
 */

import java.util.Base64;

import static java.util.Base64.getEncoder;

/**
 * @program: zftal-mobile-new
 *
 * @description: 从官网发现，从JDK 1.8开始，就提供了java.util.Base64.Decoder和java.util.Base64.Encoder的JDK公共API，可代替sun.misc.BASE64Decoder和sun.misc.BASE64Encoder的JDK内部API
 *
 * @author: Majing
 *
 * @create: 2019-02-12 10:52
 **/
public class BASE64New {
    /**
     * BASE64Encoder 加密
     *
     * @param data
     *            要加密的数据
     * @return 加密后的字符串
     */
    public static String encryptBASE64(byte[] data) {
        // BASE64Encoder encoder = new BASE64Encoder();
        // String encode = encoder.encode(data);
        // 从JKD 9开始rt.jar包已废除，从JDK 1.8开始使用java.util.Base64.Encoder
        Base64.Encoder encoder = getEncoder();
        String encode = encoder.encodeToString(data);
        return encode;
    }
    /**
     * BASE64Decoder 解密
     *
     * @param data
     *            要解密的字符串
     * @return 解密后的byte[]
     * @throws Exception
     */
    public static byte[] decryptBASE64(String data) throws Exception {
        // BASE64Decoder decoder = new BASE64Decoder();
        // byte[] buffer = decoder.decodeBuffer(data);
        // 从JKD 9开始rt.jar包已废除，从JDK 1.8开始使用java.util.Base64.Decoder
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] buffer = decoder.decode(data);
        return buffer;
    }
}
