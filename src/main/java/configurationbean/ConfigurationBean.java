package configurationbean;

//applicationContext.xml  --->  ConfigurationBean.java
//eclipse에선 src안에 패키지안에.java만들면됨..


import aljahobby2.AljaHobbyClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sawon3.Sawon;
import setter3.Setter;
import insa3.Insa;

@Configuration//환경설정파일!!
public class ConfigurationBean {
    @Bean //xml에서 bean만들때 처럼 붙인다..!!
    public Insa insaBean() //이름이 insaBean()까지가 bean객체의 이름이다..!!!!!
    {
        return new Insa("장희수"); //객체 만들어서 전달
    }//new Insa("장희수")객체가 bean객체

    @Bean
    public Sawon sawonBean()
    {
        return new Sawon("JangHeeSoo",12);
    }

    //@Bean
    @Bean(initMethod = "start", destroyMethod = "end") //setter에 method이름이 들어간다...
    public Setter setterBean(){
        return new Setter(insaBean(),sawonBean()); //상위의 insaBean()까지가 rorcpdml 이름이된다
    }

    @Bean
    public AljaHobbyClass aljaBean()
    {
        return new AljaHobbyClass(sawonBean());
    }


}
