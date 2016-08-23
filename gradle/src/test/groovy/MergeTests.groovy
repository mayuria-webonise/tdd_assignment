/**
 * Created by webonise on 22/8/16.
 */
import spock.lang.Specification
class MergeTests extends Specification{

    def "input is not null and is not new line separated"() {
        given:
        Merge m=new Merge()

        when:
        m.input("1,2,3")
        then:
        thrown Exception

//	println "test successful"
    }

    def "if input can not be parsed to integer "(){
        given:
        Merge m=new Merge()

        when:
        m.input("a+bi\n" +
                "b\n" +
                "c")
        then:
        thrown Exception
        //println "test successful"

    }

    def "check input is assigned to variable "(){
        given:
        Merge m=new Merge()

        when:
        m.input("1\n" +
                "7\n" +
                "5");
        then:
        m.getNo(0)==1
        //println "test successful"

    }

    def "check the working of getno"()
    {
        given:
        Merge m=new Merge();
        m.input("1\n" +
                "7\n" +
                "5");
        when:
        m.getNo(0);
        then:
        m.getNo(0)== 1;

    }

    def "check the working of getlength"()
    {
        given:
        Merge m=new Merge();
        m.input("1\n" +
                "7\n" +
                "5");
        when:
        m.getLength();
        then:
        m.getLength()== 3;

    }

    def "check the working of getsortedArray"()
    {
        given:
        Merge m=new Merge();
        m.input("1\n" +
                "7\n" +
                "5");
        when:
        m.getSortedArray();temp
        then:
        m.getSortedArray()== [1,5,7];

    }

    def "check whether temp gets intialized"()
    {
        given:
        Merge m=new Merge();
        m.input("1\n" +
                "7\n" +
                "5");
        when:
        m.initializeTemp(0,1,2);
        then:
        m.getTempArray()==[1,7,5]
    }
    def "check whether partition works correct"()
    {
        given:
        Merge m=new Merge();
        m.input("1\n" +
                "7\n" +
                "5");
        when:
        m.partition(0,1);
        then:
        m.partition(0,1)==0
    }


}
