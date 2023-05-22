package architecture.a_origin.service.impl;

import architecture.a_origin.dao.DemoDao;
import architecture.a_origin.dao.impl.DemoDaoImpl;
import architecture.a_origin.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = new DemoDaoImpl();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
