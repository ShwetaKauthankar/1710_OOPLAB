#include <iostream>
#include<string.h>
#include "Staff.h"

Staff::Staff()
{
    cout << "Staff Object Created(empty)" << endl;
}

Staff::~Staff()
{
    cout << "Staff Object Destroyed" << endl;
}
Staff::Staff(string firstName,string lastName)
{
    cout << "Staff Object created (firstName, lastName)" << endl;
    this->firstName=firstName;
    this->lastName=lastName;
    cout << "FirstName:" <<firstName<<endl<< "LastName:"<<lastName<<endl;
}

string Staff::getFullName()
{
    return this->firstName + " " + this->lastName;
}
