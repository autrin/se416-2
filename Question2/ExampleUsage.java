public class AppCacheDemo {
    public static void main(String[] args) {
        AppCache cache = AppCache.getInstance(); // Get Singleton Instance

        EnhancementId id1 = new EnhancementId("Feature1");
        ConfigurationData config1 = new ConfigurationData("High Performance");

        cache.set(id1, config1);

        ConfigurationData retrievedConfig = cache.get(id1);
        System.out.println("Retrieved Configuration: " + retrievedConfig.getValue());
    }
}

// Example supporting classes
class EnhancementId {
    private String id;
    public EnhancementId(String id) { this.id = id; }
    @Override
    public int hashCode() { return id.hashCode(); }
    @Override
    public boolean equals(Object obj) { return obj instanceof EnhancementId && this.id.equals(((EnhancementId) obj).id); }
}

class ConfigurationData {
    private String value;
    public ConfigurationData(String value) { this.value = value; }
    public String getValue() { return value; }
}

