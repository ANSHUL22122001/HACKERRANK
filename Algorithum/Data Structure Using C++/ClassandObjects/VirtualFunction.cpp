

class Person
{
public:
  string name;
  int age;
  virtual void getdata() = 0;
  virtual void putdata() = 0;
  virtual ~Person() {}
};

#include <array>
#include <numeric>

class Professor : public Person
{
  int id, publications;
  static int seq;
public:
  Professor() : id(++seq) {}
  void getdata() override { cin >> name >> age >> publications; }
  void putdata() override { cout << name << ' ' << age << ' ' << publications << ' ' << id << endl; }
};

int Professor::seq = 0;

class Student : public Person
{
  int id;
  array<int, 6> marks;
  static int seq;
public:
  Student() : id(++seq) {}
  void getdata() override { cin >> name >> age; for (int &x: marks) cin >> x; }
  void putdata() override { cout << name << ' ' << age << ' ' << accumulate(marks.begin(), marks.end(), 0) << ' ' << id << endl; }
};

int Student::seq = 0;
