class Department {
  public void getCourses() {
    System.out.println("These are the department's courses");
  }
}
// Create two subclasses, ComputerScience and MechanicalEngineering, each having a method with the same name getCourse() that prints specific courses for the respective departments.
class ComputerScience extends Department{
  public void getCourses() {
    System.out.println("Courses: Data Structures, Algorithms, Operating Systems");
  }
}
class MechanicalEngineering extends Department {
  public void getCourses() {
    System.out.print("Courses: Thermodynamics, Fluid Mechanics, Heat Transfer");
  }
}
class W03_P1 {
  public static void main(String[] args) {
    ComputerScience cs = new ComputerScience();
    MechanicalEngineering me = new MechanicalEngineering();
    cs.getCourses();
    me.getCourses();
  }
}