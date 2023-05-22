package basic_dl.b_bytype.dao.impl;

import basic_dl.b_bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa","bbb","ccc");
    }
}
