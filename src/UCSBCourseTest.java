import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** Test class for UCSBCourse

 * @author Phill Conrad
 * @author Vivek Patel
 * @version 2014/01/23 for lab02, cs56, W15
 * @see UCSBCourse

*/

public class UCSBCourseTest {

    /** Test case for UCSBCourse.getDept()
     @see UCSBCourse
    */

    @Test
	public void test_getDept() {
	UCSBCourse cs56 = new UCSBCourse("CMPSC","56","Advanced Applications Programming",4);
	assertEquals("CMPSC",cs56.getDept());
    }

    /** Test case for UCSBCourse.getNum() 
     @see UCSBCourse
    */
    
	@Test
	  public void test_getNum() {
	    UCSBCourse math3a = new UCSBCourse("MATH","3A","Calculus with Applications, First Course",4);
	    assertEquals("3A",math3a.getNum());
	}

	/** Test case for UCSBCourse.getUnits()
 	@see UCSBCourse
	*/

	@Test
	  public void test_getUnits() {    
	    UCSBCourse pstat120a = new UCSBCourse("PSTAT","120A","Probability and Statistics",4);
	    assertEquals(4,pstat120a.getUnits());
	}

	/** Test case for UCSBCourse.getFullCourseName()
 	@see UCSBCourse
 	*/
	
	@Test
	  public void test_getFullCourseName() {
	    UCSBCourse cs56 = new UCSBCourse("CMPSC","56","Advanced Applications Programming",4);
	    assertEquals("CMPSC56", cs56.getFullCourseName());
	}	
	
	/** Test case for UCSBCourse.getTitle()
	@see UCSBCourse 
	*/
	
	@Test 
	  public void test_getTitle() {
	    UCSBCourse math3a = new UCSBCourse("MATH","3A","Calculus with Applications, First Course",4);
	    assertEquals("Calculus with Applications, First Course", math3a.getTitle());
	}
	
}