#ifndef STUDENT_H
#define STUDENT_H
#include<string>
using namespace std;

class Student
{
    protected:
        string firstName;
        string lastName;
        string course;


    public:
        Student();
        ~Student();
        Student(string firstName);
        Student(string firstName ,string lastName, string course);
        string getFirstName() {return this->firstName;}
        string getLastName() {return this->lastName;}
        string getCourse() {return this->course;}
        string getFullName();


    private:
};

#endif // STUDENT_H
