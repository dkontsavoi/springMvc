package dk.spring.mvc.model;

/**
 * Created by dkontsavoi on 10/15/2015.
 */
public enum NsiTypes {

    KBK("���� ��������� �������������"),
    OKPD("����"),
    TA("���� ������");

    String title;

    NsiTypes(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
