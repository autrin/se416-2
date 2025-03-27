#include "PushNotification.hpp"
#include "iostream"

void PushNotification::send(std::string message) {
  std::cout << message << " by push" << std::endl;
}