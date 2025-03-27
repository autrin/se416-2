#pragma once
#include "Notification.hpp"

class SMSNotification : public Notification {
public:
  void send(std::string message) override;
};