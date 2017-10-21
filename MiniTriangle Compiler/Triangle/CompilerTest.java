/**
 * 
 */
package Triangle;

import junit.framework.TestCase;

/**
 * @author Joel
 *
 */
public class CompilerTest extends TestCase {

	public void testCompiler() {
		Compiler.compileProgram("Tests/raizanot.tri", "raizanot", true, true);
	}
	
}
