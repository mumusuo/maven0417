package org.hzl.pojo;

public class Parames {
    //当前页
    private Integer pageCurrent=1;
    //每页的个数
    private Integer pageSize=6;

    public Integer getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(Integer pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Parames(Integer pageCurrent, Integer pageSize) {
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
    }

    public Parames() {
    }

    @Override
    public String toString() {
        return "Parames{" +
                "pageCurrent=" + pageCurrent +
                ", pageSize=" + pageSize +
                '}';
    }
}
