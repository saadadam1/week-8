import java.util.*;

class Employy {
  private String name, role;
  private int salary;

  Employy(String name, String role, int salary) {
    setName(name);
    setRole(role);
    setSalary(salary);
  }

  void setName(String name) {
    this.name = name;
  }

  void setRole(String role) {
    this.role = role;
  }

  void setSalary(int salary) {
    this.salary = salary;
  }

  String getName() {
    return name;
  }

  String getRole() {
    return role;
  }

  int getSalary() {
    return salary;
  }
}

class Employ {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Employy> e = new ArrayList<Employy>();
    for (int i = 0; i < 2; i++) {
      e.add(new Employy(sc.next(), sc.next(), sc.nextInt()));
      for (Employy em : e) {
        System.out.println(em.getName() + " " + em.getRole() + " " + em.getSalary());
      }

    }

  }
}