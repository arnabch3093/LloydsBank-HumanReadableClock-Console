import org.junit.Assert;
import org.junit.Test;

public class HumanFriendlyTimeTest {

    @Test
    public void convertToHumanFriendlyTimeTest() {

        Assert.assertEquals("twelve o' clock", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(12, 00));
        Assert.assertEquals("twelve o' clock", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(00, 00));
        Assert.assertEquals("eight minutes past one", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(13, 8));
        Assert.assertEquals("quarter to four", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(15, 45));
        Assert.assertEquals("quarter past three", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(15, 15));
        Assert.assertEquals("half past three", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(15, 30));
        Assert.assertEquals("one minute past three", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(15, 1));
        Assert.assertEquals("one minute to four", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(15, 59));
        Assert.assertEquals("twenty five minutes to four", CurrentHumanFriendlyTime.convertToHumanFriendlyTime(15, 35));


    }
}