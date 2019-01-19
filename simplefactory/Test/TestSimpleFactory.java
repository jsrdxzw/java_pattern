import com.natsuki.GeoMetryToolFactory;
import com.natsuki.GeometryTool;
import com.natsuki.RectangleTool;

/**
 * @author xuzhiwei
 * created at 2018/11/21
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        GeometryTool geometryTool = GeoMetryToolFactory.getGeometryTool(RectangleTool.class);
        if (geometryTool != null) {
            geometryTool.draw();
            geometryTool.erase();
        }
    }
}
