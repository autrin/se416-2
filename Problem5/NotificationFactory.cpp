#include "NotificationFactory.hpp"
#include "EmailNotification.hpp"
#include "Notification.hpp"
#include "NotificationChannelType.hpp"
#include "PushNotification.hpp"
#include "SMSNotification.hpp"

// returns the appropriate Notification subclass based on the channelType.
static std::unique_ptr<Notification> createNotification(NotificationChannelType channelType) {
  switch (channelType) {
  case NotificationChannelType::EMAIL:
    return std::make_unique<EmailNotification>();
  case NotificationChannelType::SMS:
    return std::make_unique<SMSNotification>();
  case NotificationChannelType::PUSH:
    return std::make_unique<PushNotification>();
  default:
    return nullptr; // TODO: handle this
  }
}
