
import spock.lang.Shared
import spock.lang.Specification
/**
 * @author Petri Kainulainen
 */
class QuickSortTests extends Specification

{
def "input is not null and is not new line separated"() {
    given:
        Quick q=new Quick()

    when:
        q.input("1,2,3")
    then:
        thrown Exception
//	println "test successful"
}

    def "if input can not be parsed to integer "(){
        given:
        Quick q=new Quick()

        when:
        q.input("a+bi\n" +
                "b\n" +
                "c")
        then:
        thrown Exception
        //println "test successful"

    }
    def "check the working of getno"()
    {
        given:
        Quick q=new Quick();
        q.input("1\n" +
                "7\n" +
                "5");
        when:
        q.getNo(0);
        then:
        q.getNo(0)== 1;

    }
    def "check the working of exchange nos"()
    {
        given:
        Quick q=new Quick();
        q.input("1\n" +
                "7\n" +
                "5");
        when:
        q.exchangeNumbers(0,1);
        then:
        q.getNo(0)== 7;

    }

    def "check the working of getlength"()
    {
        given:
        Quick q=new Quick();
        q.input("1\n" +
                "7\n" +
                "5");
        when:
        q.getLength();
        then:
        q.getLength()== 3;

    }

    def "check the working of getsortedArray"()
    {
        given:
        Quick q=new Quick();
        q.input("1\n" +
                "7\n" +
                "5");
        when:
        q.getSortedArray();
        then:
        q.getSortedArray()== [1,5,7];

    }

    def "check the value of pivot"()
    {
        given:
        Quick q=new Quick();
        q.input("1\n" +
                "7\n" +
                "5");
        when:
        q.getPivot(0,2);
        then:
        q.getPivot(0,2)== 5;

    }

}
