#include <iostream>
#include<string.h>
#include "Student.h"

Student::Student()
{
    cout << "Student Object Created(empty)" << endl;
}

Student::~Student()
{
    cout << "Student Object Destroyed" << endl;
}

Student::Student(string firstName,string lastName,string course)
{
    cout << "Student Object created (firstName, lastName, course)" << endl;
    this->firstName=firstName;
    this->lastName=lastName;
    this->course=course;

    cout << "FirstName:" <<firstName<<endl<< "LastName:"<<lastName<<endl<< "Course:"<<course<<endl;
}

string Student::getFullName()
{
    return this->firstName + " " + this->lastName + " " + this->course;
}
