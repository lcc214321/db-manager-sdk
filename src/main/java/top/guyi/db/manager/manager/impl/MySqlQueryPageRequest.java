package top.guyi.db.manager.manager.impl;

import top.guyi.db.manager.manager.QueryPageRequest;

public class MySqlQueryPageRequest extends QueryPageRequest {

    public MySqlQueryPageRequest(int page, int size) {
        super(page, size);
    }

    @Override
    public String getPageSql() {
        return String.format(" limit %s,%s",this.getStart(),this.getEnd());
    }

}
