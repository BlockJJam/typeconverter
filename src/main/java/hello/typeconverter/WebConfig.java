package hello.typeconverter;

import hello.typeconverter.typeconverter.converter.IntegerToStringConverter;
import hello.typeconverter.typeconverter.converter.IpPortToStringConverter;
import hello.typeconverter.typeconverter.converter.StringToIntegerConverter;
import hello.typeconverter.typeconverter.converter.StringToIpPortConverter;
import hello.typeconverter.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new IntegerToStringConverter());
//        registry.addConverter(new StringToIntegerConverter());
        // 위 주석의 이유: 아래 포맷터 MyNumberFormatter와 사실 같은 기능인데 우선순위가 높아서 포맷터가 안먹힘
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        //포맷터 추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
