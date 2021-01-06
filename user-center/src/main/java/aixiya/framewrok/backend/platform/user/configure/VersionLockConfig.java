package aixiya.framewrok.backend.platform.user.configure;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;

/**开启乐观锁，是否启用，暂时先不启用
 */
//@Configuration
public class VersionLockConfig {
//    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}
