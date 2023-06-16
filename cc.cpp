#include <iostream>
#include <thread>
#include <chrono>

void clearScreen()
{
    // Function to clear the console screen
    std::cout << "\033[2J\033[1;1H";
}

void delay(int milliseconds)
{
    // Function to introduce delay in milliseconds
    std::this_thread::sleep_for(std::chrono::milliseconds(milliseconds));
}

int main()
{
    int delayTime = 100; // Delay between animation frames in milliseconds
    std::string heart = 
        "   ***     ***   \n"
        "  *****   *****  \n"
        " ******* ******* \n"
        " *************** \n"
        "  *************  \n"
        "   ***********   \n"
        "    *********    \n"
        "     *******     \n"
        "      *****      \n"
        "       ***       \n"
        "        *        \n";
        
    std::string message = "I love you";

    // Clear the screen and display the heart initially
    clearScreen();
    std::cout << heart;

    // Animate the message
    for (char& c : message) {
        std::cout << c;
        std::cout.flush();
        delay(delayTime);
    }
    std::cout << std::endl;

    return 0;
}
