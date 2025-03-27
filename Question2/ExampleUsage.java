public class Main {
    public static void main(String[] args) {
        AppCache cache = AppCache.getInstance();

        // Create sample objects
        EnhancementId enhancementId = new EnhancementId(101);
        ConfigurationData configData = new ConfigurationData("ConfigA");

        // Add data to the cache
        cache.set(enhancementId, configData);

        // Retrieve data from the cache
        ConfigurationData retrievedData = cache.get(enhancementId);

        System.out.println("Retrieved Configuration: " + retrievedData.getName());
    }
}
