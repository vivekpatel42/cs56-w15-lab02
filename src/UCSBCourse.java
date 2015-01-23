/** UCSBCourse is a class to represent a UCSB Course.
 @author Phill Conrad
 @author @@@ Vivek Patel
 @version 01/19/2015 for lab01, cs56, S13
*/

public class UCSBCourse {

    private String dept; // Department Abbreviation (e.g. CMPSC, MATH, PSTAT)
    private String num; // Course Number w/ suffix (e.g. "56", "3B", "120A")
    private int units; // units course is worth

    /** Constructor 
	@param dept Department Abbreviation (e.g. CMPSC, MATH, PSTAT)
	@param num Course Number including suffix (e.g. "56", "3B", "120A")
	@param units Number of Units
    */

    public UCSBCourse (String dept, String num, int units)
    {
	// assign attributes from parameters
	this.dept = dept; 
	this.num = num;
	this.units = units;
    }

    /**
       Get department Abbreviation (e.g. CMPSC, MATH, PSTAT)
     */
    
    public String getDept () { return this.dept; } 

    /**
       Get course number (e.g. "56", "3A", "120A")
     */
    public String getNum () { return this.num; } // @@@ STUB fixme!!!

    /**
       Get units course is worth
     */
    public int getUnits () { return this.units;} // @@@ STUB fixme !!!

    /** 
	Get full course name (e.g. CMPSC56, MATH3A, PSTAT120A)
     */
    
    public String getFullCourseName () 
    {
	return this.dept + this.num; // string concatenation
    }

} // class UCSBCourse
