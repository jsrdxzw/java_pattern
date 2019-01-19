import com.natsuki.*;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        ActorBuilder actorBuilder = new HeroBuilder();
        Actor actor = actorBuilder.constract();
        System.out.println(actor);
    }
}
