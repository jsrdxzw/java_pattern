import com.natsuki.ICourse;
import com.natsuki.JavaDiscountCourse;

/**
 * @author xuzhiwei
 * created at 2018/11/18
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96,"java从0到企业级开发",348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println(javaCourse+"origin:"+javaCourse.getOriginPrice());
    }
}
