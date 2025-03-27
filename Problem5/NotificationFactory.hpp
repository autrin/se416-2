#include "Notification.hpp"
#include "NotificationChannelType.hpp"

class NotificationFactory {
  public:
    static Notification* createNotification(NotificationChannelType channelType);
};