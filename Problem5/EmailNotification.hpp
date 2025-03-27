#pragma once
#include "Notification.hpp"

class EmailNotification : public Notification {
public:
  void send(std::string message) override;
};