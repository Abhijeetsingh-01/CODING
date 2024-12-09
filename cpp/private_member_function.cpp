#include <iostream>
using namespace std;
class Box {
public:
double length;
void setWidth( double wid );
double getWidth( void );
private:
double width;
};
double Box::getWidth(void) {
return width;
}