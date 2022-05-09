package Ch136_Bridgelabz;

public class EmpWageByOops {
    final static int WAGE_PER_HRS = 20;
    final static int FULL_DAY_HRS = 8;
    final static int PART_TIME_HRS = 4;
    final static int IS_FULL_TIME = 2;
    final static int IS_PART_TIME = 1;
    final static int MAX_HRS = 100;
    final static int DAY_PER_MONTH = 20;

    /**
     * @empWage is a method for calculating monthly wage
     */
    public void empWage() {

        int totalEmpHrs = 0;
        int totalMaxDay = 0;
        int totalMaxEmpWage = 0;

        while (totalEmpHrs < MAX_HRS && totalMaxDay <= DAY_PER_MONTH) {
            int empHrs = 0;
            totalMaxDay++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Eployee is Present");
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Eployee is Present in Part Time");
                    break;

                default:
                    System.out.println("Eployee is Absent");
                    empHrs = 0;
            }

            totalEmpHrs = totalEmpHrs + empHrs;
            int empWage = empHrs * WAGE_PER_HRS;
            totalMaxEmpWage = totalMaxEmpWage + empWage;
            System.out.println("Emp Wage: " + empWage);

        }
        System.out.println("Total Employee Wage: " + totalMaxEmpWage);
    }

    /**
     * @param args is main method of class
     */

    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation Program");
        EmpWageByOops obj = new EmpWageByOops(); // object of class
        obj.empWage();
    }

}

