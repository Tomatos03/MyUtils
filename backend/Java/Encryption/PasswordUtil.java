import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *  maven依赖: spring-security-crypto
 *
 * @author : Tomatos
 * @date : 2025/7/29
 */
public class PasswordUtil {
    private static final PasswordEncoder encoder = new BCryptPasswordEncoder();

    /**
     *  将明文利用加密算法加密得到密文
     *
     * @param rawPassword 明文
     * @return java.lang.String 密文
     * @since : 1.0
     * @author : Tomatos
     * @date : 2025/7/30 11:22
     */
    public static String encode(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    /**
     * 验证明文是否与密文一致
     *
     * @param rawPassword  明文
     * @param encodedPassword 加密
     * @return boolean
     * @since : 1.0
     * @author : Tomatos
     * @date : 2025/7/18 13:48
     */
    public static boolean matches(String rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }
}
