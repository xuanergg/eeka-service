package com.greatonce.oms.dao.impl.trade;

import com.greatonce.oms.dao.impl.AbstractOmsDao;
import com.greatonce.oms.dao.trade.ReturnSignDao;
import com.greatonce.oms.domain.trade.ReturnSign;
import com.greatonce.oms.query.trade.ReturnSignQuery;
import org.springframework.stereotype.Repository;

/**
 * ReturnSign <br/>
 * 退货签收
 * 
 * @author code-generator
 * @author Shenzhen Greatonce Co Ltd
 * @version 3.0
 * @version 2017-11-07
 */

@Repository
public class ReturnSignDaoImpl extends AbstractOmsDao<ReturnSign,ReturnSignQuery> implements ReturnSignDao {

    /**
    * 获取XML名称
    */
    @Override
    protected String getStatementPrefix() {
        return "com.greatonce.oms.dao.trade.ReturnSignMapper";
    }
    
}