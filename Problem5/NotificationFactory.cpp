#include "NotificationFactory.hpp"
#include "EmailNotification.hpp"
#include "Notification.hpp"
#include "NotificationChannelType.hpp"
#include "PushNotification.hpp"
#include "SMSNotification.hpp"

// returns the appropriate Notification subclass based on the channelType.
Notification *
NotificationFactory::createNotification(NotificationChannelType channelType) {
  switch (channelType) {
  case NotificationChannelType::EMAIL:
    return new EmailNotification();
  case NotificationChannelType::SMS:
    return new SMSNotification();
  case NotificationChannelType::PUSH:
    return new PushNotification();
  default:
    return nullptr; // TODO: handle this
  }
}
