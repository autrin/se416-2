#include "EmailNotification.hpp"
#include <iostream>

void EmailNotification::send(std::string message){
  std::cout << message << " by email" << std::endl;
}