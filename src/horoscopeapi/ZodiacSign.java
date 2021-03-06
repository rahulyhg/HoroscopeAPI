/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopeapi;

/**
 *
 * @author Xiaoerge
 * @version 1.0 Compiled by Java 1.6u33
 */
public enum ZodiacSign 
{
    
    Rat("1972, 1984, 1996, 2008","鼠"),
    Ox("1973, 1985, 1997, 2009","牛"),
    Tiger("1974, 1986, 1998, 2010","虎"),
    Rabbit("1975, 1987, 1999, 2011","兔"),
    Dragon("1976, 1988, 2000, 2012","龙"),
    Snake("1977, 1989, 2001, 2013","蛇"),
    Horse("1978, 1990, 2002, 2014","马"),
    Sheep("1979, 1991, 2003, 2015","羊"),
    Monkey("1980, 1992, 2004, 2016","猴"),
    Rooster("1981, 1993, 2005, 2017","鸡"),
    Dog("1982, 1994, 2006, 2018","狗"),
    Pig("1983, 1995, 2007, 2019","猪");
    
    private String infoz;
    private String symbol;
    
    private ZodiacSign(String s, String s2)
    {
        infoz = s;
        symbol = s2;
    }
    /**
     * Get a year list for current Zodiac sign in String format. eg 1976, 1988, 2000, 2012
     * @return Year list as String
     */
    protected String getInfo()
    {
        return infoz;
    }
    /**
     * <p>Get the Chinese symbol for current Zodiac sign in String format. eg 龙</p>
     * <p>Note that the symbol is Non-ASCII. It may not display correctly</p>
     * @return Chinese symbol as String
     */
    protected String getSymbol()
    {
        return symbol;
    }
}
