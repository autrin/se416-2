#include "NotificationChannelType.hpp"
#include "NotificationFactory.hpp"

int main() {
  // Get a notification object without knowing which concrete class it is
  std::unique_ptr<Notification> notification =
      NotificationFactory::createNotification(NotificationChannelType::EMAIL);

  // Use the notification through the interface without knowing the concrete
  // type
  notification->send("Hello!");
  return 0;
}