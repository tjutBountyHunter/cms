package xsl.erp.pojo;

import java.util.Date;

public class XslTag {
    private Integer id;

    private String name;

    private Short usenum;

    private String createdate;

    private Boolean state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getUsenum() {
        return usenum;
    }

    public void setUsenum(Short usenum) {
        this.usenum = usenum;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}