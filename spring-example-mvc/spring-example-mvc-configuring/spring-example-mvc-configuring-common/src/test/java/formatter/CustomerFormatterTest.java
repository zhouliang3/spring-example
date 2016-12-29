package formatter;

import com.ilearn.example.spring.mvc.conf.formatter.PhoneNumberFormatter;
import com.ilearn.example.spring.mvc.conf.model.PhoneNumberModel;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.format.support.DefaultFormattingConversionService;


public class CustomerFormatterTest {

    @Test
    public void test() {

        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        conversionService.addFormatter(new PhoneNumberFormatter());

        PhoneNumberModel phoneNumber = new PhoneNumberModel("010", "12345678");
        Assert.assertEquals("010-12345678", conversionService.convert(phoneNumber, String.class));

        Assert.assertEquals("010", conversionService.convert("010-12345678", PhoneNumberModel.class).getAreaCode());

    }


}
