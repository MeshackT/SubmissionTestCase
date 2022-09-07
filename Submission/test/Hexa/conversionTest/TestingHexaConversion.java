
package Hexa.conversionTest;

import TestCase.HexadecimalConversion;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Templaton
 */
public class TestingHexaConversion
{

    HexadecimalConversion objHex = new HexadecimalConversion();

    /**constructor 
    *Test getter 
    */
    @Test
    public void Constructor()
    {
        HexadecimalConversion objHex = new HexadecimalConversion(7690);
        assertEquals(7690, objHex.getNum(), 0.0);
    }

    //test valid values
    @Test
    public void validValues()
    {
        objHex.setNum(8490);
        assertEquals(8490, objHex.getNum(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidValues()
    {
        HexadecimalConversion objHex = new HexadecimalConversion();
        objHex.setNum(-9090);
        assertEquals(-9090, objHex.getNum(), 0.0);
    }

  
    
}
