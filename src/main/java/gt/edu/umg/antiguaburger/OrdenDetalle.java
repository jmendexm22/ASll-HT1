package gt.edu.umg.antiguaburger;

import java.util.*;

/**
 *
 */
public class OrdenDetalle {

    /**
     * Default constructor
     */
    public OrdenDetalle() {

    }

    private String observaciones;
    private long id;
    private String content;
    private String content2;
    private float idmenu;
    private float total;

    /////variables menu
    private String envio2;
    private String envio3;
    private String envio4;
    private String envio5;
    private String envio6;

    /////variables alternativas cena
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private String alternativa5;

    /////variables alternativas almuerzo
    private String almu1;
    private String almu2;
    private String almu3;
    private String almu4;
    private String almu5;
    private String almu6;

    public String getAlmu1() {
        return almu1;
    }

    public void setAlmu1(String almu1) {
        this.almu1 = almu1;
    }

    public String getAlmu2() {
        return almu2;
    }

    public void setAlmu2(String almu2) {
        this.almu2 = almu2;
    }

    public String getAlmu3() {
        return almu3;
    }

    public void setAlmu3(String almu3) {
        this.almu3 = almu3;
    }

    public String getAlmu4() {
        return almu4;
    }

    public void setAlmu4(String almu4) {
        this.almu4 = almu4;
    }

    public String getAlmu5() {
        return almu5;
    }

    public void setAlmu5(String almu5) {
        this.almu5 = almu5;
    }

    public String getAlmu6() {
        return almu6;
    }

    public void setAlmu6(String almu6) {
        this.almu6 = almu6;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa4() {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    public String getAlternativa5() {
        return alternativa5;
    }

    public void setAlternativa5(String alternativa5) {
        this.alternativa5 = alternativa5;
    }

    private String envio1;

    public String getEnvio1() {
        return envio1;
    }

    public void setEnvio1(String envio1) {
        this.envio1 = envio1;
    }

    public String getEnvio2() {
        return envio2;
    }

    public void setEnvio2(String envio2) {
        this.envio2 = envio2;
    }

    public String getEnvio3() {
        return envio3;
    }

    public void setEnvio3(String envio3) {
        this.envio3 = envio3;
    }

    public String getEnvio4() {
        return envio4;
    }

    public void setEnvio4(String envio4) {
        this.envio4 = envio4;
    }

    public String getEnvio5() {
        return envio5;
    }

    public void setEnvio5(String envio5) {
        this.envio5 = envio5;
    }

    public float getTotal() {

        return total;
    }

    public void setTotal(float total) {

        if (total == 1) {
            this.total = total = 26;

        } else {
            this.total = total;
        }

    }

    public float getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(float idmenu) {

        if (idmenu == 1) {
            this.idmenu = idmenu = 18;
        }
        if (idmenu == 2) {

            this.idmenu = idmenu = 30;
        }

    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
