package basic_dl.c_oftype.dao.impl;

import basic_dl.c_oftype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoPostgreDao implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("postGre","bbb","ccc");
    }
}
