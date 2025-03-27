#include "Notification.hpp"
#include "NotificationChannelType.hpp"
#include <memory>

class NotificationFactory {
  public:
    static std::unique_ptr<Notification> createNotification(NotificationChannelType channelType);
};