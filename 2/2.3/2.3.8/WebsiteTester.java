public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website defaultSite = new Website();
        Website goodSchool = new Website("goodSchool", "edu");
        Website codehs = new Website("codehs", "com", 1000000);
        
        System.out.println(defaultSite);
        System.out.println(goodSchool);
        System.out.println(codehs);
        
    }
}