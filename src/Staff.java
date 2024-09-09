 public class Staff extends Profile {

     private String position;
     private double salary;


     public Staff(String name, String address, String contactNumber, String email, int ID,
                  String position, double salary) {
         super(name, address, contactNumber, email, ID);
         this.salary = salary;
         this.position = position;
     }

     public void setPosition(String position) {
         this.position = position;
     }


     public String getPosition() {
         return position;
     }


     public void setSalary(double salary) {
         this.salary = salary;
     }


     public double getSalary() {
         return salary;
     }

     @Override
     public Profile clone() {
         Staff SF = new Staff(name, address, contactNumber, email, ID, position,
                 salary);
         return SF;
     }

     @Override
     public boolean equals(Object s) {
         Staff SF = (Staff) s;
         return super.equals(s) && SF.getPosition().equals(position) && SF.getSalary() == salary;
     }

     @Override
     public String toString() {
         return (super.toString() + "\t" + position + "\t " + salary
         );
     }
 }