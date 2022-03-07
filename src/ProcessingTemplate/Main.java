package ProcessingTemplate;
import processing.core.PApplet;
import java.lang.invoke.MethodHandles;

///<summary>
/// Hooks PApplet to run our code within the "processing.core.PApplet" namespace context
/// in this context, also serves as the literal entrypoint for our application.
///</summary>

public class Main extends PApplet
{

    //settings() public hook, must be more accessible than the function it overwrites (must be public)
    public void settings()
    {
        size(500, 500);
    }

    //settings() public hook, must be more accessible than the function it overwrites (must be public)
    public void setup()
    {
        frameRate(144);
        smooth();
    }

    //draw() public hook, must be more accessible than the function it overwrites (must be public)
    public void draw()
    {

    }

    //EntryPoint
    public static void main(String... args)
    {
        //kind of hacky but I'm not 100% familiar with java. would be a lot easier if I could use a
        //non-static entrypoint
        String qualifiedClassPath = MethodHandles.lookup().lookupClass().getPackageName() + '.' + MethodHandles.lookup().lookupClass().getSimpleName();
        PApplet.main(qualifiedClassPath);
    }
}