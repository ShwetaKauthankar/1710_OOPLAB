#ifndef STAFF_H
#define STAFF_H
#include<string>
using namespace std;

class Staff
{
    protected:
        string firstName;
        string lastName;

    public:
        Staff();
        ~Staff();
        Staff(string firstName);
        Staff(string firstName ,string lastName);
        string getFirstName() {return this->firstName;}
        string getLastName() {return this->lastName;}
        string getFullName();

    private:
};

#endif // STAFF_H
