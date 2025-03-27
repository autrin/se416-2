import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class AppCache {
    private static volatile AppCache instance;
    private final Map<EnhancementId, ConfigurationData> cache;

    // Private constructor prevents direct instantiation
    private AppCache() {
        cache = new ConcurrentHashMap<>();
    }

    // Thread-safe initialization
    public static AppCache getInstance() {
        if (instance == null) {
            synchronized (AppCache.class) {
                if (instance == null) {
                    instance = new AppCache();
                }
            }
        }
        return instance;
    }

    // Store or update an entry in the cache
    public void set(EnhancementId enhancementId, ConfigurationData configurationData) {
        cache.put(enhancementId, configurationData);
    }

    // Retrieve an entry from the cache
    public ConfigurationData get(EnhancementId enhancementId) {
        return cache.get(enhancementId);
    }
}
